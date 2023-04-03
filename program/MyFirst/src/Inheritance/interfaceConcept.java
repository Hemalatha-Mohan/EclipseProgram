package Inheritance;

//create an interface
interface Lang {
void getName(String name);
}

//class implements interface
class ProgrammingLang implements Lang {

// implementation of abstract method
public void getName(String name) {
 System.out.println("Programming Language: " + name);
}
}

class interfaceConcept {
public static void main(String[] args) {
 ProgrammingLang language = new ProgrammingLang();
 language.getName("Java");
}
}