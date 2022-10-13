package com.directi.training.dip.exercise_solution;
import java.io.IOException;


public class EncodingModule
{
    public void encode(ReaderInterface reader, WriterInterface writer) throws IOException
    {
      String inputString = reader.read();
      String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
      writer.write(encodedString);
    }

  
}

