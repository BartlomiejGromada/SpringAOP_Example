package pl.gromada.spring_aop_example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import pl.gromada.spring_aop_example.model.Person;

@Aspect
@Component
public class LoggerAspect {

    @Before("execution(* pl.gromada.spring_aop_example.repo.PersonRepository.get(..)) && args(pin)")
    public void logBefore(JoinPoint joinPoint, String pin) {
        System.out.printf("Signature method: %s --> " +
                "Before method 'get' for isbn: %s\n", joinPoint.getSignature(), pin);
    }

    @AfterReturning(pointcut = "execution(* pl.gromada.spring_aop_example.repo.PersonRepository.get(..)) && args(pin))",
            returning = "result", argNames = "joinPoint,pin,result")
    public void logAfterReturning(JoinPoint joinPoint, String pin, Person result) {
        System.out.printf("Signature method: %s --> " +
                "Method get successfully returned value for isbn: %s --> %s\n", joinPoint.getSignature(), pin, result);
    }

    @AfterThrowing(pointcut = "execution(* pl.gromada.spring_aop_example.repo.PersonRepository.get(..)) && args(pin)",
        throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, String pin, Throwable error) {
        System.out.printf("Signature method: %s --> " +
                "Method get throw error for isbn: %s --> %s\n", joinPoint.getSignature(), pin, error.getMessage());
    }
}
