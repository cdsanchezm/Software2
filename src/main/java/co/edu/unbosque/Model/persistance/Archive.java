package co.edu.unbosque.Model.persistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Objects;

public class Archive {

    private ObjectInputStream input;
    private ObjectOutputStream output;

    public Archive(File file) {
        if (file.exists()) {
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeFile(ArrayList objetos, File file) {
        try {
            output = new ObjectOutputStream(new FileOutputStream(file));
            output.writeObject(objetos);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList readFile(File file) {

        ArrayList objetos = new ArrayList();
        if (file.length() != 0) {
            try {
                input = new ObjectInputStream(new FileInputStream(file));
                objetos = (ArrayList) input.readObject();
            } catch (FileNotFoundException e) {
                // TODO: handle exception
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return objetos;
    }

}
