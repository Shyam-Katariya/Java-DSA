/*

    * Class inside Class :

 */

class Outer {
    int data = 30;// instance variable

    void display() {
        class Local {
            void msg() {

                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }
}
class C_into_C {

    public static void main(String[] args) {
        C_into_C c = new C_into_C();
        //c.display();
    }
}