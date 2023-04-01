package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("homework.json", false))
        {
            String text = "Hello User!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

        }


    List<Objects> checkArray() {
        if (arr == null) {
            throw new IllegalStateException("Collection not found");
        }
        List<Integer> arrAttention = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arrAttention.add(i);
                throw new IllegalStateException("Value is empty! Indexes of empty values is are");
            }
        }
        return arrAttention;
    }
}