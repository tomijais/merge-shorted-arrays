void merge(int a1[], int a2[], int result[]) {

    int i = 0; // indice a1
    int j = 0; // indice a2
    int k = 0; // indice result


    while (i < a1.length && j < a2.length){
        if(a1[i] < a2[j]){
            result[k] = a1[i];
            i++;
        }else{
            result[k] = a2[j];
            j++;
        }
        k++
    }

    while ( i < a1.length){
        result[k] = a1[i];
        i++;
        k++;
    }

    while ( i < a2.length){
    result[k] = a2[j];
    j++;
    k++;
    }
return result
}