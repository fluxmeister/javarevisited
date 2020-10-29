# javarevisited
<h1>Example project as seen on the Web</h1>
<a href="https://javarevisited.blogspot.com/2012/06/builder-design-pattern-in-java-example.html" target="_blank">Original webpage</a>
<br/>

&nbsp;1. Guidelines for Builder design pattern in Java<br/>
&nbsp;<ol>
<li> Make a static nested class called Builder inside the class whose object will be build by Builder. In this example its Cake.</li>

<li> Builder class will have exactly same set of fields as original class.</li>
<li> Builder class will expose method for adding ingredients e.g. sugar() in this example. Each method will return same Builder object. Builder will be enriched with each method call.</li>

<li> Builder.build() method will copy all builder field values into actual class and return object of Item class.</li>
<li> Item class (class for which we are creating Builder) should have private constructor to create its object from build() method and prevent outsider to access its constructor.</li>
</ol>
