package service.impl;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import model.Word;
import service.FileService;

public class FileServiceImpl implements FileService{
private static final String WORD_FILE_PATH="files/EngAz.txt";
    @Override
    public Word[] readFile {
        // TODO Auto-generated method stub
                File file=new File(WORD_FILE_PATH);
               try{
                InputStream inputStream=new FileInputStream(file);
                BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
                 byte[] bytes= bufferedInputStream.readAllBytes();
                System.out.println(new String(bytes));
                }catch (IOException e){
                throw new RuntimeException(e);
               } 
               return null;


    }

    @Override
    public boolean writeFile() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
