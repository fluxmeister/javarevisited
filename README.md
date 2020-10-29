# javarevisited
<h1>Example project as seen on the Web</h1>
<a href="https://javarevisited.blogspot.com/2012/06/builder-design-pattern-in-java-example.html" target="_blank">Original webpage</a>
<br/>

&nbsp;<h1>1. Guidelines for Builder design pattern in Java</h1><br/>
&nbsp;<ol>
<li> Make a static nested class called Builder inside the class whose object will be build by Builder. In this example its Cake.</li>

<li> Builder class will have exactly same set of fields as original class.</li>
<li> Builder class will expose method for adding ingredients e.g. sugar() in this example. Each method will return same Builder object. Builder will be enriched with each method call.</li>

<li> Builder.build() method will copy all builder field values into actual class and return object of Item class.</li>
<li> Item class (class for which we are creating Builder) should have private constructor to create its object from build() method and prevent outsider to access its constructor.</li>
</ol>
<br/>
&nbsp;<h1>2. Builder design pattern in Java – Pros and Cons</h1><br/>
Live everything Builder pattern also has some disadvantages, but if you look at below, advantages clearly outnumber disadvantages of Builder design pattern. Any way here are few advantages and disadvantage of Builder design pattern for creating objects in Java.

Advantages:
<ol>
<li> more maintainable if number of fields required to create object is more than 4 or 5. </li>
<li> less error-prone as user will know what they are passing because of explicit method call.</li>
<li> more robust as only fully constructed object will be available to client.</li>
</ol>
Disadvantages:
<ol>
<li> verbose and code duplication as Builder needs to copy all fields from Original or Item class.</li>
</ol>
<br/>
&nbsp;<h1>3. When to use Builder Design pattern in Java</h1><br/>
Builder Design pattern is a creational pattern and should be used when number of parameter required in constructor is more than manageable usually 4 or at most 5. Don't confuse with Builder and Factory pattern there is an obvious difference between Builder and Factory pattern, as Factory can be used to create different implementation of same interface but Builder is tied up with its Container class and only returns object of Outer class.

