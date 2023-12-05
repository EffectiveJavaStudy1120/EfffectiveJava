////점층적 생성자 패턴
//public class Book {
//    private final String title;
//    private final String author;
//    private final int pageCount;
//    private final boolean isFiction;
//    private final boolean isHardcover;
//
//    public Book(String title) {
//        this(title, "Unknown", 0, false, false);
//    }
//
//    public Book(String title, String author) {
//        this(title, author, 0, false, false);
//    }
//
//    public Book(String title, String author, int pageCount) {
//        this(title, author, pageCount, false, false);
//    }
//
//    // 모든 파라미터를 받는 생성자
//    public Book(String title, String author, int pageCount, boolean isFiction, boolean isHardcover) {
//        this.title = title;
//        this.author = author;
//        this.pageCount = pageCount;
//        this.isFiction = isFiction;
//        this.isHardcover = isHardcover;
//    }
//}
//
//
//public class Computer {
//    // 필수 및 선택적 컴포넌트
//    private String CPU;
//    private String RAM;
//    private String storage;
//    private String graphicsCard;
//    private String powerSupply;
//
//    // private 생성자
//    private Computer(Builder builder) {
//        this.CPU = builder.CPU;
//        this.RAM = builder.RAM;
//        this.storage = builder.storage;
//        this.graphicsCard = builder.graphicsCard;
//        this.powerSupply = builder.powerSupply;
//    }
//
//    // Builder 정적 내부 클래스
//    public static class Builder {
//        private String CPU;
//        private String RAM;
//        private String storage;
//        private String graphicsCard;
//        private String powerSupply;
//
//        public Builder(String CPU, String RAM) { // 필수 컴포넌트
//            this.CPU = CPU;
//            this.RAM = RAM;
//        }
//
//        public Builder storage(String storage) {
//            this.storage = storage;
//            return this;
//        }
//
//        public Builder graphicsCard(String graphicsCard) {
//            this.graphicsCard = graphicsCard;
//            return this;
//        }
//
//        public Builder powerSupply(String powerSupply) {
//            this.powerSupply = powerSupply;
//            return this;
//        }
//
//        public Computer build() {
//            return new Computer(this);
//        }
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        // 기본 컴포넌트(CPU, RAM)와 일부 선택적 컴포넌트로 컴퓨터 구축
//        Computer myComputer = new Computer.Builder("Intel i7", "16GB")
//                .storage("1TB SSD")
//                .graphicsCard("NVIDIA RTX 3080")
//                .build();
//
//        // 다른 설정으로 컴퓨터 구축
//        Computer officeComputer = new Computer.Builder("AMD Ryzen 5", "8GB")
//                .storage("500GB HDD")
//                .powerSupply("650W")
//                .build();
//    }
//}
//
//
//장점 : 가독성 불변성, 단계적 구축 가능. 팔수와 선택 구분하여 생성가능
