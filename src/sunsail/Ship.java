package sunsail;
//Bonus task
//1.  Try to describe hierarchy between employees on some imaginary ship called “Sunsail” using
//inheritance. Use ship as root entity (parent class). You have these definitions at your disposal:
//Captain, First mate, Second mate, Chief engineer, First engineer, Second engineer. You are free
//to omit class fields and methods, only extension strategy matters for this task.

public class Ship {
}
class Capatain extends Ship{

}
class FirstMate extends Capatain{

}
class  SecondMate extends FirstMate{

}
class ChiefEngineer extends SecondMate{

}
class FirstEngineer extends ChiefEngineer{

}