package ss17_io_binary_file_amp.excercise.manage_product_and_save_out_binary_file.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private String branch;
    private int price;
    private String description;

    public Product() {
    }

    public Product(int code, String name, String branch, int price, String description) {
        this.code = code;
        this.name = name;
        this.branch = branch;
        this.price = price;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
    public String getinfo(){
        return  String.format("%s,%s,%s,%s,%s",this.code,this.name,this.branch,this.price,this.description);
    }
}
