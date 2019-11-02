package com.sda.patherns.structural.decorator.ex2;

public class DemoDecoratorPattern {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSource fileDataSource = new FileDataSource("design-patterns/src/main/resources/encrypted_output.txt");
        DataSourceDecorator encryptionDecorator = new EncryptionDecorator(fileDataSource);
        DataSourceDecorator compressionDecorator = new CompressionDecorator(encryptionDecorator);
        compressionDecorator.writeData(salaryRecords);

        DataSource fileData = new FileDataSource("design-patterns/src/main/resources/encrypted_output.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(fileData.readData());
        System.out.println("- Decoded --------------");
        System.out.println(compressionDecorator.readData());

    }
}
