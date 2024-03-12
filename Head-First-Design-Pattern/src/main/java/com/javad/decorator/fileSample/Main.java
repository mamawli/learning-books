package com.javad.decorator.fileSample;

public class Main {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSourceDecorator dataSourceDecorator = new CompressDecoration(
                new EncryptionDecorator(
                        new FileDataSource("/Users/javad/Public/Projects/learning-books/Head-First-Design-Pattern/src/main/resources/out/OutputDemo.txt" )
                )
        );

        dataSourceDecorator.writeData(salaryRecords);
        DataSource dataSource = new FileDataSource("/Users/javad/Public/Projects/learning-books/Head-First-Design-Pattern/src/main/resources/out/OutputDemo.txt" );
        System.out.println("- Input ----------------" );
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------" );
        System.out.println(dataSource.readData());
        System.out.println("- Decoded --------------" );
        System.out.println(dataSourceDecorator.readData());
    }
}
