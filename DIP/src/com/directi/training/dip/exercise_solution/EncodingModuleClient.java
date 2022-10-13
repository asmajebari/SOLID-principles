package com.directi.training.dip.exercise_solution;
import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();
        ReaderInterface reader = new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        WriterInterface writer = new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        encodingModule.encode(reader, writer); 

        reader = new NetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        writer = new DatabaseWriter();
        encodingModule.encode(reader, writer);
    }
}
