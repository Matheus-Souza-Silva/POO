// Faça um programa que receba como dado de entrada um número qualquer 
// e mostre como resultado o dobro do número digitado

#include <stdio.h>
#include <stdlib.h>

int main(){
    system("cls");

    int numero = 0;

    printf("Insira o numero: ");
    scanf("%d", &numero);

    printf("O dobro do numero digitado e: %d", numero * 2);

    return 0;
}