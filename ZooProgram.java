public class ZooProgram{
    public static void main(String args[]){
        Lion leo = new Lion();
	Monkey monky = new Monkey();

        leo.roar();
        
        Sloth kevin = new Sloth();
        kevin.talk();
        kevin.eat();

	monky.chimper();
    }
}
