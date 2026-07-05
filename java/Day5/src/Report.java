//// === 하나의 클래스가 3개 인터페이스 모두 구현 ===
//class Report implements Printable, Saveable, Exportable {
//    private String title;
//    private String content;
//
//    Report(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }
//
//    @Override
//    public void print() {            // Printable 구현
//        System.out.println("=== " + title + " ===");
//        System.out.println(content);
//    }
//
//    @Override
//    public void save(String filename) {  // Saveable 구현
//        System.out.println("'" + title + "'을 " + filename + "에 저장했습니다.");
//    }
//
//    @Override
//    public String export() {         // Exportable 구현
//        return "[EXPORT] " + title + ": " + content;
//    }
//}