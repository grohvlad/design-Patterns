# designPatterns

Mostly home assignments

---
[Block 1 UML OOP](#block-1-uml-oop)  
[Block 2 Factory Method](#block-2-factory-method)  
[Block 3 Abstract Factory Method](#block-3-abstract-factory-method)  
[Block 4 Builder Method](#block-4-builder-method)  
[Block 5 Prototype Method](#block-5-prototype-method)  
[Block 6 Singleton Method](#block-6-singleton-method)  
[Block 7 Adapter Method](#block-7-adapter-method)  
[Block 8 Bridge Method](#block-8-bridge-method)  
[Block 9 Composite Method](#block-9-composite-method)  
[Block 10 Decorator Method](#block-10-decorator-method)  
[Block 11 Facade Method](#block-11-facade-method)  
[Block 12 Flyweight Method](#block-12-flyweight-method)  

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

## Block 4 Builder Method
<h3> Home work 4 Task 1 </h3>
Реалізовано модель створення автомобіля з різними компонентами за допомогою методу Будівельник. Метод використовувався при зборі автомобіля та кузова для нього.

#### UML:  
<img src="https://user-images.githubusercontent.com/108753646/222953988-a34b1877-0a6a-4bf6-b012-50c047de8f12.png" alt="UML diagram 10" width=600>

<a href="https://github.com/grohvlad/design-Patterns/tree/main/4%20Builder/src/Task_hw1">Realization</a>

<h3> Home work 4 Task 2 </h3>
Реалізовано модель створення текстового рядка використовуючи метод Будівельник.

#### UML:  
<img src="https://user-images.githubusercontent.com/108753646/222953674-7c595184-9707-4a11-b76e-2fa139bb981c.png" alt="UML diagram 11" width=400>

<a href="https://github.com/grohvlad/design-Patterns/tree/main/4%20Builder/src/Task_hw2">Realization</a>

## Block 5 Prototype Method
<h3> Home work 5 Task 1 </h3>
Реалізовано модель створення автомобіля з різними компонентами та з можливістю вкладеного клонуванняза допомогою методів Будівельник та Прототип. Прототип використовується у класах всіх складових автомобіля та у його власному. Потреби в додаванні інтерфейсу прототип, або в імплементації Clonable не було помічено оскільки при даній постановці задачі немає наборіб однакових класів чи наслідування. (Якби були клас автомобіль, мотоцикл, тягач, що складали б автопарк, чи були різні класи для сидінь або дверей тоді можна було б додати, а так має з'явитись у наступному завданні).

#### UML:  
<img src="https://user-images.githubusercontent.com/108753646/222967154-7ab2eb90-36ae-4b89-b608-35be26a0109f.png" alt="UML diagram 12" width=600>

<a href="https://github.com/grohvlad/design-Patterns/tree/main/5%20Prototype/Task_hw1/src">Realization</a>

<h3> Home work 5 Task 2 </h3>
З класу рівнянь прибрано зайві класи абстрактної фабрики й додано метод прототип, який дозволяє клонувати рівняння для подальших імплементацій.

#### UML:  
<img src="https://user-images.githubusercontent.com/108753646/222984644-421d821b-24b9-4ff3-9ab9-0016d3f45451.png" alt="UML diagram 12" width=600>

<a href="https://github.com/grohvlad/design-Patterns/tree/main/5%20Prototype/Task_hw2/src">Realization</a>

## Block 6 Singleton Method
<h3> Home work 6 Task 1 </h3>
Реалізовано шаблон проектування Одинак для читання та обробки текстових файлів у програмі. Створено клас умовних користувачів, котрі асинхронно використовують файл.

<a href="https://github.com/grohvlad/design-Patterns/tree/main/6%20Singleton/src/Task_hw1/src">Realization</a>

<h3> Home work 6 Task 2 </h3>
До завдання з шаблоном проєктування Будівельник додано шаблон Одинак. Оскільки робота ведеься не з данними а зі створенням нових екземплярів класу, і цу є основним поточним завданням програми вибрано спосіб Одтнака, де він створюється з самого початку. (у нього не ресурсозатратний конструктор, як було б з базами даних)

<a href="https://github.com/grohvlad/design-Patterns/tree/main/6%20Singleton/src/Task_hw2/src">Realization</a>

## Block 7 Adapter Method

<h3> Home work 7 Task 2 </h3>
Створено адаптер для бібліотеки методом iз використанням класу переходу.

<a href="https://github.com/grohvlad/design-Patterns/tree/main/7%20Adapter/src/Task_hw2/src">Realization</a>


## Block 8 Bridge Method

<h3> Home work 8 Task 1 </h3>

Проведно рефакторинг класів, із застосуванням шаблону проектування Міст.
Додано ще одну реалізацію методу міст, котра включає в себе місце для замовлення(в дорогу/ в кафе) та містить список замовлень. Тобто Замовлення є абстракцією, де її місця окремі реалізації, а набір напоїв є імплементацією.


#### UML:  
<img src="https://user-images.githubusercontent.com/108753646/224154588-09d808ec-c6e2-4feb-823f-6d1abd03f08b.png" alt="UML diagram 13" width=900>

<a href="https://github.com/grohvlad/design-Patterns/tree/main/8%20Bridge/Task_hw1/src">Realization</a>

<h3> Home work 8 Task 2 </h3>
Проведно рефакторинг коду, із застосуванням шаблону проектування Міст.  

<a href="https://github.com/grohvlad/design-Patterns/tree/main/8%20Bridge/Task_hw2/src">Realization</a>


## Block 9 Composite Method

<h3> Home work 9 </h3>

Проведено рефакторинг коду, із застосуванням шаблону проєктування Компонувальник так щоб програма могла розрахувати виплату заробітної плати працівникам супермаркету, що очолюється директором (менеджером) містить три відділи (м’ясний відділ, відділ молокопродуктів, кондитерський відділ), кожен з яких очолюється менеджером, та містить трьох співробітників-продавців.
Із особливостей - є один клас бос, у котрого немає вищого керівництва, у менеджера, як і у продавця може ути керівник бос або менеджер. Продавець, у якого керівник бос вважається більш елітним (Для спеціальних замовлень)

<a href="https://github.com/grohvlad/design-Patterns/tree/main/9%20Composite/Task_hw1/src">Realization</a>


## Block 10 Decorator Method

<h3> Home work 10 Task 1 </h3>
Розглянуто клас PrintableString, що є контейнером для поля типу рядок та містить єдиний публічний метод для виведення цього рядка у консоль.  

Для цього класу описано набір декораторів:  

PostComaDecorator – декоратор для додавання знаку кома у кінець рядка.  
PostEndlDecorator – декоратор для додавання знаку кома у кінець рядка.  
PostExclaimDecorator – декоратор для додавання знаку оклику у кінець рядка.  
PostWordDecorator – декоратор для додавання слова у кінець рядка.  
PreWordDecorator – декоратор для додавання слова у початок рядка.  
Використовуючи цей набір декораторів виведено у консоль вираз  
Hello, World!  
починаючи з порожнього базового рядка.

<a href="https://github.com/grohvlad/design-Patterns/tree/main/10%20Decorator/Task_hw1/src">Realization</a>

<h3> Home work 10 Task 2 </h3>

Розглядається Beverage (Напій) та його нащадки Espresso (Еспресо), DarkRoast (Чорна кава), Decaf (Кава без кофеїну), що мають методи description() та cost(), що повертають опис кави та її вартість відповідно.

Опиcано декоратори для додавання до екземплярів вищенаведених класів додаткові наповнювачі – молоко, цукор, вершки, крем.

Використовуючи цей декоратор, створено такі напої:

Еспресо з двома порціями цукру.  
Чорну каву з вершками та двома порціями цукру.  
Чорну каву з кремом та порцією цукру.  
Кава без кофеїну з молоком та двома порціями цукру.  

<a href="https://github.com/grohvlad/design-Patterns/tree/main/10%20Decorator/Task_hw2/src">Realization</a>

## Block 11 Facade Method

<h3> Home work 11</h3>
Проведено рефакторинг коду із застосуванням шаблону проєктування Фасад, щоб спростити роботу клієнта зі складною бібліотекою відеоконвертації.
Практичним було б використання чи статичних методів компресій і т.д. чи патерна Одинак.

<a href="https://github.com/grohvlad/design-Patterns/tree/main/11%20Facade/Task_hw1/src">Realization</a>

## Block 12 Flyweight Method

<h3> Home work 12</h3>
Реалізовано шаблон проєктування Легковаговик для повторного використання створених раніше об'єктів для різних частин автомобіля. У реалізації легковаговик використовується для курма та мотора, при чому клас кермо повністю вкладається в легковаговик (WheelFlyweight), а для мотора ще додається клас Engine, що містить у собі легковаговик(EngineFlyweight), у класі  додається лише ID мотора, який для кожного різний.

<a href="https://github.com/grohvlad/design-Patterns/tree/main/11%20Facade/Task_hw1/src">Realization</a>
