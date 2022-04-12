class Array { // Uma classe em C++
    Array(int n) { // Construtor
        int *vec = new int[n];
    }
    
    ~Array() { // Destrutor
        delete[] vec;
    }
}