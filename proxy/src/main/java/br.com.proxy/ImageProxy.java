package br.com.proxy;

public class ImageProxy implements Image {

    private ImageImpl image;
    private String fileName;

    public ImageProxy(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(image == null){
            image = new ImageImpl(fileName);
        }
        image.display();
    }
}
