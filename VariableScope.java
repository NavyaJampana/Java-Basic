package JavaBasics;
class VariableScope {
    int num = 10; // Global variable

    void display() {
        int num = 20; // Local variable
        System.out.println("Local Variable: " + num);
        System.out.println("Global Variable: " + this.num);
    }

    public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        obj.display();
    }
}

