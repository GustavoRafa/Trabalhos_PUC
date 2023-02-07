struct Elemento{
	int num;
	struct Elemento *prox;
};
typedef struct Elemento Elemento;

struct Fila{
    struct Elemento *inicio; /*aponta para o elemento do in�cio da fila*/
    struct Elemento *fim; /*aponta para o elemento do fim da fila*/
};
typedef struct Fila Fila;

Elemento *aux;

Fila* cria_fila(){
    /*aloca��o do ponteiro li para controlar a lista*/
    Fila* fi = (Fila*) malloc(sizeof(Fila));
    if(fi != NULL){
	/*a fila inicia-se vazia, portanto inicio e fim s�o iguais a NULL*/
        fi->fim = NULL;
        fi->inicio = NULL;
    }
    return fi;
}

int main(){
    Fila *fi = cria_fila();

    return 0;
}

void insere_elemento(Fila *fi){
	/*a cada inser��o alocamos dinamicamente um espa�o para um novo elemento*/
	Elemento*novo =(Elemento*) malloc(sizeof(Elemento));
	printf("Digite o numero a ser inserido na fila: ");
	scanf("%d",&novo->num);
	novo->prox = NULL;
	/*caso a fila esteja vazia, o elemento inserido ser� o primeiro e o �ltimo */
	if(fi->inicio == NULL){
		fi->inicio = novo;
		fi->fim = novo;
	/*caso a pilha ja contenha algum elemento, o novo elemento ser� sempre inserido no fim da fila*/
	}else{
		fi->fim->prox = novo;
		fi->fim = novo;
	}
	printf("\nNumero inserido na fila!");
	getch();
}

void consulta_fila(Fila *fi){
	if(fi->inicio == NULL){
		printf("\nFila Vazia!!");
	}else{
		aux = fi->inicio;
		do{
			printf(" %d ", aux->num);
			aux = aux->prox;
		} while(aux != NULL);
	}
	getch();
}
