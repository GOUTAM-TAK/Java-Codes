package day7.tester;

import day7.core.*;

public class TestPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Printer[] printers = {new ConsolePrinter(), new NetworkPrinter(),new FilePrinter()};
        for(Printer p: printers) {
        	if(p instanceof ConsolePrinter)
        		p.print("Hello Console");
        	else if (p instanceof FilePrinter) {
        		FilePrinter f =(FilePrinter)p;
        		f.fileOpen();       //p is Printer ref so it can't access FilePrinter specific method->DownCasting
        		f.print("File access msg");
        		f.fileClose();
        	}
        	else {
        		NetworkPrinter n=(NetworkPrinter)p;
        		n.estabilshConection();
        		n.print("msg to server");
        		n.disconectConection();
        	}
        }
	}

}
