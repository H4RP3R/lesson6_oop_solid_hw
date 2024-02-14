## В программе нарушены следующие принципы
1. ***Single Responsibility Principle***  
Класс `User` отвечает как за предоставление, так и за сохранение данных, что нарушает принцип единственной ответственности. Также при необходимости изменения механизма сохранения придется изменять непосредственно сам класс.
2. ***Dependency Inversion Principle***  
В методе `save` класса `User` напрямую создается экземпляр класса `Persister`, что создает зависимость класса `User` от `Persister`. Оба класса должны зависеть от абстракций.