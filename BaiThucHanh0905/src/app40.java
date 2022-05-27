// kiểm tra nếu chi số lớn hơn hoặc bằnge
// và nhỏ hơn kích thước của linkedList-1thì mới lấy
// ngược lại thông báo lỗi
if ((index<e) || (index>(linkedList.size() 1))){
  System.out.println("Chi số cần lấy phải lớn hơnevà nhỏ hơn"
     +(linkedList.size()-1));
}else{
  // truy cập phần tử có chỉ số index trong linkedList
 // vì linkedList có kiểu là String
  // nên các phần từ con của nó cũng có kiểu dữ liệu là String
  String node=1linkedList.get(index);
  System.out.println("Phần tử có chi số="+index+"trong linkedList là"+node);
// truy cập phần tử đầu tiên trong danh sách
// sử dụng phương thức getFirst()
String firstNode=linkedList.getFirst();
// truy cập phần tử đầu tiên trong danh sách
// sử dụng phương thức getlast()
String lastNode=linkedList.getLast();
System.out.println("\nPhän tử dầu tiên trong danh sách là"+firstNode+
  ";Phần tử cuối cùng trong danh sách là "+ lastNode);