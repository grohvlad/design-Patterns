# designPatterns

Mostly home assignments

---
[Block 1 UML OOP](#block-1-uml-oop)  
[Block 2 Factory Method](#block-2-factory-method)  
[Block 3 Abstract Factory Method](#block-3-abstract-factory-method)  
[Block 4 Builder Method](#block-4-builder-method)


---

## Block 1 UML OOP
<h3> Pactise 1 Task 1 </h3>

<img src="https://user-images.githubusercontent.com/108753646/217768234-73198792-a2d2-4c2f-86f2-c303113b9fe7.png" alt="UML diagram 1" width=600>
<a href="https://github.com/grohvlad/design-Patterns/tree/main/1%20UML%20diagrams/Task_pr_1/src">Realization</a>

<h3> Pactise 1 Task 2 </h3>

I have changed a bit the task, add some methods in purpose to make this task more realistic. 
Але поки не зрозумів, чи правильно я реалізував, бо в практиці трохи по інакшому. Я не зною як при створенні об'єкта через інтерфейс звертатись до методів об'єкта, яких немає у інтерфейсі(

<img src="https://user-images.githubusercontent.com/108753646/217912055-09f3c7d5-b4c8-43d2-a810-fb0778565dbd.png" alt="UML diagram 2" width=600>
<a href="https://github.com/grohvlad/design-Patterns/tree/main/1%20UML%20diagrams/Task_pr_2/src">Realization</a>


<h3> Home work 1 Task 1 </h3>
Методи не створював, лише конструктори оск на мою думку завданн полягає якраз в них.
<img src="https://user-images.githubusercontent.com/108753646/217939703-c811d07a-4596-40b0-b51d-ec533faf3128.png" alt="UML diagram 3" width=600>
<a href="https://github.com/grohvlad/design-Patterns/tree/main/1%20UML%20diagrams/Task_hw_1/src">Realization</a>

<h3> Home work 1 Task 2 </h3>
<img src="https://user-images.githubusercontent.com/108753646/218058383-d9f8648b-9c1e-42de-8045-18442066183c.png" alt="UML diagram 4" width=600>
<a href="https://github.com/grohvlad/design-Patterns/tree/main/1%20UML%20diagrams/Task_hw_2/src">Realization</a>

<h3> Home work 1 Task 3 </h3>
<img src="https://user-images.githubusercontent.com/108753646/218086243-8623061b-84e6-4efb-8994-3c066b3026a4.png" alt="UML diagram 5" width=600>
<a href="https://github.com/grohvlad/design-Patterns/tree/main/1%20UML%20diagrams/Task_hw_3/src">Code</a>

## Block 2 Factory Method
<h3> Home work 2 Task 1 </h3>
Реалізовано модель роботи кафе із використанням <b>фабричного методу</b>. Замовлення +- випадково рівномірно розподіляються з використанням нормального розподілу.

#### UML:  
<img src="https://user-images.githubusercontent.com/108753646/221967984-33949e86-1d62-4649-8ddb-e0018e3b53f7.png" alt="UML diagram 6" width=900>
<a href="https://github.com/grohvlad/design-Patterns/tree/main/2%20Factory%20method/src/Task_hw_1/src">Realization</a>


<h3> Home work 2 Task 2 </h3>
Реалізовано модель вказану в завданні із використанням шаблонів фабричного методу. Результат роботи програми зберігається в папці output де вказано необхідну інформацію напроти кожного виразу з вхідних данних. Також в кінці кожного текстового файлу на виході надано відповідь по максимальому та мінімальному розв'язку. Реалізація пошуку цих значень можливо потребує покращення.

#### UML:  
<img src="https://user-images.githubusercontent.com/108753646/221368369-cdefcb85-563d-43f5-8f18-5add4669ffc2.png" alt="UML diagram 7">
<a href="https://github.com/grohvlad/design-Patterns/tree/main/2%20Factory%20method/src/Task_hw_2/src">Realization</a>

## Block 3 Abstract Factory Method
<h3> Home work 3 Task 1 </h3>
Реалізовано модель закупки громадського транспорту, що використовує метод абстрактна фабрика для додавання нових виробників. Також результатом вивидить результуючу вартість вибору фірми.

#### UML:  
<img src="https://user-images.githubusercontent.com/108753646/221438132-89504520-b059-42a9-bc1d-3f8ec8b3c625.png" alt="UML diagram 8" width=900>

<a href="https://github.com/grohvlad/design-Patterns/tree/main/3%20Abstract%20factory/src/Task_hw2">Realization</a>

<h3> Home work 3 Task 2 </h3>
Адаптовано модель кафе із використанням абстрактної фабрики для кавових машин. Завдання містить велику кількість залежностей, щщо від чого можна визначати й моделювати. Реалізована модель використовує значення середньої кількості відвідувачів(однаковий) та параметра кавоварки - коефіцієнт задоволення, щоб розрахувати кількість клієнтів для подальшого вирахування ціни кафе. Результатом виводиться середня кількість клієнтів за день та ціна кави у меню для наявних виробниів. 

#### UML:  
<img src="https://user-images.githubusercontent.com/108753646/222904651-ca336a13-7573-4d70-9efb-1373eb6c8f02.png" alt="UML diagram 9" width=900>

<a href="https://github.com/grohvlad/design-Patterns/tree/main/3%20Abstract%20factory/src/Task_hw3">Realization</a>

## Block 4 Builder Method
<h3> Home work 3 Task 1 </h3>
Реалізовано модель створення автомобіля з різними компонентами за допомогою методу Будівельник. Метод використовувався при зборі автомобіля та кузова для нього.

#### UML:  
<img src="https://user-images.githubusercontent.com/108753646/222953988-a34b1877-0a6a-4bf6-b012-50c047de8f12.png" alt="UML diagram 10" width=600>

<a href="https://github.com/grohvlad/design-Patterns/tree/main/4%20Builder/src/Task_hw1">Realization</a>

<h3> Home work 3 Task 2 </h3>
Реалізовано модель створення текстового рядка використовуючи метод Будівельник.

#### UML:  
<img src="https://user-images.githubusercontent.com/108753646/222953674-7c595184-9707-4a11-b76e-2fa139bb981c.png" alt="UML diagram 11" width=400>

<a href="https://github.com/grohvlad/design-Patterns/tree/main/4%20Builder/src/Task_hw2">Realization</a>
