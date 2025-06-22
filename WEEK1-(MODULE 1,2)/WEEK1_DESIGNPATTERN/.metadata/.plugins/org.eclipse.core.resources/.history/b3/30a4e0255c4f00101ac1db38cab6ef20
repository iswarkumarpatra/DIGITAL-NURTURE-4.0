
public class Computer {
	
	private String CPU;
    private String RAM;
    private String storage;
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;}
    
    
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer gamingComputer = new Computer.Builder("Intel i9", "32GB").setStorage("1TB SSD").build();

        System.out.println(gamingComputer);
		

	}

    }}
