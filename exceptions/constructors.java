package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

class superOf{
    public superOf() throws IOException{}  //Throwable, Exception, IOException, FileNotFoundException

    public void superM() throws Throwable{
    }
}


class constructors extends superOf {

    public constructors() throws Exception{} // can't throw FNF

    public void superM() throws IOException{ //can't throw Exception
    }
    public static void main(String[] args) {

    }
}


class childOf extends constructors {
    // public childOf() throws IOException{} can't throw broader
    public childOf() throws Throwable{} 
    
    public void superM() throws FileNotFoundException{

    }
}
