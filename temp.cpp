class temp{
    int fun(int n , int *fp){
        int t,f;
        if(n<=2){
            *fp = 1,
            return 1;
        }
    }
    t=fun(n-1,fp);
    f=t+ *fp;
    *fp = t;
    return f;
}
    int main(){
    int x = 15;
    printf(fun(5,&x));
    return 0;

}