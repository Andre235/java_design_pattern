package 设计模式.创建型模式.建造者模式.product;

/**
 * @Author: geek
 * @Date: 2020/9/26 16:33
 * @Description:
 */
public class Computer {
    /**
     * cpu
     */
    private String CPU;
    /**
     * 显卡
     */
    private String videoCard;
    /**
     * 内存
     */
    private String RAM;

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + CPU + '\'' +
                ", videoCard='" + videoCard + '\'' +
                ", RAM='" + RAM + '\'' +
                '}';
    }
}
