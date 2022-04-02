import 'dart:io';

void main() {
  int T = int.parse(stdin.readLineSync().toString());
  List<List<dynamic>> result = [];
  if (T >= 1 && T <= 100) {
    for(int i = 0 ; i < T ; i++ ){

      List<int> first_printer = stdin.readLineSync().toString().split(" ").map((String ink) => int.parse(ink)).toList();
      List<int> second_printer = stdin.readLineSync().toString().split(" ").map((String ink) => int.parse(ink)).toList();
      List<int> third_printer = stdin.readLineSync().toString().split(" ").map((String ink) => int.parse(ink)).toList();
            
      List<int> ink_sum = [];
      List<dynamic> mini_result = [];
      List<int> lowest_ink_units = [];
     
      ink_sum.add(first_printer.fold(0, (int sum, int ink) => sum+ink));
      ink_sum.add(second_printer.fold(0, (int sum, int ink) => sum+ink));
      ink_sum.add(third_printer.fold(0, (int sum, int ink) => sum+ink));
      if(ink_sum.any((int total_ink) => total_ink<1000000)){
        mini_result.add("IMPOSSIBLE");
      }
      else{
        for(int j = 0 ; j < 4 ; j++){
          lowest_ink_units.add(lowest_of_three(first_printer[j], second_printer[j], third_printer[j]));
        }
        int sum_lowest_ink = lowest_ink_units.fold(0, (int sum, int lowest_ink) => sum+lowest_ink);
        if(sum_lowest_ink<1000000){
          mini_result.add("IMPOSSIBLE");
        }
        else{
          if(lowest_ink_units[0]>=1000000){
            mini_result.add(1000000);
            mini_result.add(0);
            mini_result.add(0);
            mini_result.add(0);
          }
          else if(lowest_ink_units[0]+lowest_ink_units[1]>=1000000){
            mini_result.add(lowest_ink_units[0]);
            mini_result.add((1000000-lowest_ink_units[0]));
            mini_result.add(0);
            mini_result.add(0);
          }
          else if(lowest_ink_units[0]+lowest_ink_units[1]+lowest_ink_units[2]>=1000000){
            mini_result.add(lowest_ink_units[0]);
            mini_result.add(lowest_ink_units[1]);
            mini_result.add(1000000-lowest_ink_units[0]-lowest_ink_units[1]);
            mini_result.add(0);
          }
          else{
            mini_result.add(lowest_ink_units[0]);
            mini_result.add(lowest_ink_units[1]);
            mini_result.add(lowest_ink_units[2]);
            mini_result.add(1000000-lowest_ink_units[0]-lowest_ink_units[1]-lowest_ink_units[2]);
          }
        }
      }
      result.add(mini_result);
    }
    for(int i = 0 ; i < T ; i++ ){
      String ans = result[i].join(" ");
      print("Case #${i+1}: $ans");
    }
  }
}
int lowest_of_three(int a, int b, int c){
  int lowest = a;
  if(lowest>b){
    lowest = b;
  }
  if(lowest>c){
    lowest = c;
  }
  return lowest;
}