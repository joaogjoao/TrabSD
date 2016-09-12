# TrabSD
Trabalho do serviço de Chat


----Pastas-----
1.Utils - Códigos de Exemplo 



----Descrição-----
Implementar um serviço de chat que possibilite:

	1-envio de mensagens para um grupo de pessoas(multcast ip)
	2-envio de mensagens individuais para as pessoas conectadas (UDP)
	3-compartilhamento e download de arquivos (TCP)
	4-uma interface de interações (GUI ou CLI)

	PROTOCOLO TEXTUAL:
		-JOIN [APELIDO]
		-LEAVE [APELIDO]
		-MSG [APELIDO] "texto"
		-MSGIDV FROM [APELIDO] TO [APELIDO] "texto"

		->LISTFILES[APELIDO]
		->FILES[arq1,arq2]
		->DOWNFILE [APELIDO] "nome_arq"
		->DOWNINFO [IP,PORTA]

