public class ZooProgram{
    public static void main(String args[]){
        Lion leo = new Lion();
	leo.roar();
	    
	Monkey monky = new Monkey();
	monky.chimper();
	    
        Cat caico = new Cat();
        caico.meow();
	    
        Shark donny = new Shark ();
        donny.swim();
	    
        Sloth kevin = new Sloth();
        kevin.talk();
        kevin.eat();
	    
	MountainGoat timothy = new MountainGoat();
        timothy.eat();
        
        Teacher msO = new Teacher();
        msO.teacherSays(0);
        msO.teacherSays(1);
        msO.teacherSays(4);
    }
}
