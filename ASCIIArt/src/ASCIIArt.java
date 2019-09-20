/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	private static void thickhead() {
		System.out.println("     \\\\||//");
		System.out.println("    [ o  o ]");
		System.out.println("     ( __ )");
	}
	private static void thicktoparm() {
		System.out.println("--o0O--------------");
	}
	private static void thickboard() {
		System.out.println("|  I can do this  |");
		System.out.println("|because I am tall|");
		System.out.println("|  o o o o o o o  |");
		System.out.println("|   o o o o o o   |");
		System.out.println("|    o o o o o    |");
		System.out.println("|     o o o o     |");
		System.out.println("|      o o o      |");
		System.out.println("|       o o       |");
		System.out.println("|        o        |");
	}
	private static void thickbottomarm() {
		System.out.println("------------O0o----");
	}
	private static void thicklegs() {
		System.out.println("   |  |     |  |");
		System.out.println("   |  |     |  |");
		System.out.println("    ||       || ");
		System.out.println("  __  _     _  __");
		System.out.println(" (     )   (     )");
		System.out.println("  -----     -----");
	}
	
	public static void main (String [] args) {
		thickhead();
		thicktoparm();
		thickboard();
		thickbottomarm();
		thicklegs();
		System.out.println("This is my man Chadwick. He's got Gucci shoes and thick body parts.");
	}
}