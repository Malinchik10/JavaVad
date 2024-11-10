package HW_18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<List<String>> {
    @Override
    public List<String> call() throws Exception {
        System.out.printf("[%s] Start thread\n", Thread.currentThread().getName());
        String tmpdir = System.getProperty("java.io.tmpdir") + "HW_18";
        List<String> list = new ArrayList<String>();

        Path path = Paths.get(tmpdir);
        if(!Files.exists(path)) {
            Files.createDirectories(path);
        }

        System.out.printf("[%s] Create files\n", Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            try {
                String filePath = String.format("%s\\%s_file_%s.log", tmpdir, Thread.currentThread().getName(), i);
                list.add(filePath);

                File file = new File(filePath);
                if(!file.exists()) {
                    file.createNewFile();
                }

                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                for (int j = 0; j < 10; j++) {
                    String str = randomString(100);
                    writer.write(str + System.lineSeparator());
                }

                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.printf("[%s] Sleeping ...\n", Thread.currentThread().getName());
        Thread.sleep(new Random().nextInt(1000, 3000));

        return list;
    }

    static final int startChar = (int) '!';
    static final int endChar = (int) '~';

    static String randomString(final int maxLength) {
        final Random random = new Random(); // Or SecureRandom
        final int length = random.nextInt(maxLength + 1);
        return random.ints(length, startChar, endChar + 1)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
