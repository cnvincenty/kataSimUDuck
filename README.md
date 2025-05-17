## KATA SimUDuck ##

## Grupo 4
- Ing. Cesar Nilton Vincenty Funes
- Ing. Paul Larry Anderson Zabala
- Ing. Julio Cesar Mamani Condori
- Ing. Jose David Ripalda Fernandez

Which of the following are disadvantages of using inheritance to provide Duck behavior? (Choose all that apply.)

- [x] A. Code is duplicated across subclasses.
- [x] B. Runtime behavior changes are diffi cult.
- [ ] C. We can’t make ducks dance
- [x] D. Hard to gain knowledge of all duck behaviors.
- [ ] E. Ducks can’t fl y and quack at the same time.
- [x] F. Changes can unintentionally affect other duck

Lots of things can drive change. List some reasons you’ve had to change code in your applications (we put in a couple of our own to get you started).

- Cambio de especificaciones, nuevos requerimientos
- Mejoras en el rendimiento
- Nuevas Librerias
- Implementacion de pruebas automatizadas

Using our new design, what would you do if you needed to add rocket-powered flying to the SimUDuck app?

**R. Crea una clase FlyRocketPowered que implemente la interfaz FlyBehavior.**

Can you think of a class that might want to use the Quack behavior that isn’t a duck?

**R. Tal vez un dispositivo que haga cuac**

```
> java -jar target/katasimuduck-1.0-SNAPSHOT.jar
Soy un pato de collar
Pato volando
Cuac
---
Soy un pato de goma
Pato no volando
Chirrido
---
Soy un pato senuelo
Pato no volando
Silencio
---
Soy un pato cabeza roja
Pato volando
Cuac
---
Cambiando el comportamiento en tiempo de ejecucion
Pato no volando
```