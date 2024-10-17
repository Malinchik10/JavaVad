package HW14;//Thread vs Stream


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class StreamMain{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String relativeFilePath = "relative-path.txt";
        createFileByPath(relativeFilePath, Constants.Text);
        String relativeFile = readFileByPath(relativeFilePath);
        System.out.println("Relative file content: " + relativeFile.substring(0, 25));

        String absoluteFilePath = "C:\\Java\\homework\\absolute-path.txt";
        createFileByPath(absoluteFilePath, Constants.Text);
        String absoluteFile = readFileByPath(absoluteFilePath);
        System.out.println("Absolute file path: " + absoluteFile.substring(0, 25));

        Car car = new Car("Niva", 180);
        String serializedString = serializeObject(car);
        System.out.println("Car:\n" + serializedString);

        Car deserializedCar = deserializeObject(serializedString);
        System.out.println("Car object: " + deserializedCar);
    }

    public static void createFileByPath(String path, String content) throws IOException {
        FileWriter fileWriter = new FileWriter(path);//class,type
        fileWriter.write(content);//у этого экземпляра вызвали write;
        fileWriter.close();
    }

    public static String readFileByPath(String path) throws IOException {//путь к файлу
        return Files.readString(Path.of(path));
    }

    public static String serializeObject(Object item) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(bos);
        os.writeObject(item);
        String serialized_object = Base64.getEncoder().encodeToString(bos.toByteArray());
        os.close();

        return serialized_object;
    }

    public static Car deserializeObject(String content) throws IOException, ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(content);
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        ObjectInputStream oInputStream = new ObjectInputStream(bis);
        return  (Car) oInputStream.readObject();
    }
}
