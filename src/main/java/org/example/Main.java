package org.example;//package org.example;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.RandomAccessFile;
//import java.nio.ByteBuffer;
//import java.nio.channels.FileChannel;
//
//public class Main {
//    public static void main(String[] args) {
//        RandomAccessFile aFile = null;
//        try {
//            aFile = new RandomAccessFile("./.gitignore", "rw");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        FileChannel inChannel = aFile.getChannel();
//
//        ByteBuffer buf = ByteBuffer.allocate(488);
//
//        int bytesRead = 0;
//        try {
//            bytesRead = inChannel.read(buf);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        while (bytesRead != -1) {
//
//            System.out.println("Read " + bytesRead);
//            buf.flip();
//
//            while (buf.hasRemaining()) {
//                System.out.print((char) buf.get());
//            }
//
//            buf.clear();
//            try {
//                bytesRead = inChannel.read(buf);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        try {
//            aFile.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}


import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public void streamNums() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, ExecutionException, InterruptedException {
        IntUnaryOperator intUnaryOperator = a -> a + 1;
       Consumer ex= (i) -> {
           Arrays.stream(i.getClass().getFields()).map((field -> field.getName())).forEach(System.out::println);

           IntStream.iterate(0, intUnaryOperator.andThen(a -> a + 10)).limit(4).forEach(System.out::println);};
       ex.accept(7);
       Integer rng = new Random().nextInt();
        System.out.println(rng);
        CompletableFuture future = CompletableFuture.supplyAsync(()->"async future").thenApply((data)->data.length());
        future.thenAccept(System.out::println);

      var hssk=  Stream.generate(()->"shhs -"+new Random().nextInt()).limit(10);
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<String> list2 = Arrays.asList("one", "two", "three");

        String string = (String) "djd".getClass(). getConstructor(String.class).newInstance("eueue");
        System.out.println(string);

    }
}