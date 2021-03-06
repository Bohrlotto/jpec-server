package it.attocchi.jpec.server.bl;

public enum ConfigurazionePecEnum {
	
	// Abilita o Disabilita 
	PEC_ENABLE_EMAIL_CHECK,
	PEC_ENABLE_EMAIL_SEND,	
	// Server PEC in Uscita
	PEC_SMTP_SERVER,
	PEC_SMTP_PORT,
	PEC_SENDER_EMAIL,
	PEC_SENDER_NAME,
	PEC_SMTP_USERNAME,
	PEC_SMTP_PASSWORD,	
	PEC_SMTP_SSL,
	PEC_SMTP_SSLNOCHECK,
	// Server PEC Ingresso
	// IMAP, POP3
	PEC_SERVER_MODE,
	PEC_SERVER,
	PEC_SERVER_PORT,
	PEC_SERVER_USERNAME,
	PEC_SERVER_PASSWORD,
	PEC_SERVER_SSL,
	PEC_SERVER_SSLNOCHECK,
	PEC_SERVER_IMAP_FOLDER,
	// OTHER MAILBOXES CONFIG FOLDER
	PEC_MAILBOXES_FOLDER, // PEC_MAILBOXES_FOLDER
	PEC_MAILBOX_NAME,
	PEC_MAILBOX_UFFICIO,
	/* SPECIFICA LA CLASSE DA UTILIZZARE PER GENERARE IL PROTOCOLLO */
	// PEC_PROTOCOLLO_IMPL,
	
	PEC_SERVER_DELETE_MESSAGE,
	PEC_SERVER_MARKREAD_MESSAGE,
	PEC_SERVER_ONLY_UNREAD,
	
	PEC_POSTACERT_EXTRACT,
	
	// Server Notifiche Interno
	PEC_NOTIFICHE_SMTP_SERVER,
	PEC_NOTIFICHE_SMTP_PORT,
	PEC_NOTIFICHE_SMTP_SSL,
	PEC_NOTIFICHE_SMTP_SSLNOCHECK,
	PEC_NOTIFICHE_SMTP_USERNAME,
	PEC_NOTIFICHE_SMTP_PASSWORD,
	PEC_NOTIFICHE_SENDER_EMAIL,
	PEC_NOTIFICHE_SENDER_NAME,

	PEC_EML_STORE_FOLDER,
	PEC_ENABLE_EML_STORE,
	PEC_FOLDER_OUT,
	PEC_FOLDER_IN,
	PEC_ATTACH_STORE_DB,
	PEC_ATTACH_STORE_FOLDER,	
	
	PEC_ENABLE_NOTITY_SEND,
	PEC_ENABLE_NOTITY_STATUS,
	PEC_NOTIFICA_INVIO_DESTINATARI,
	PEC_NOTIFICA_CAMBIOSTATO_DESTINATARI,
	
	PEC_MESSAGE_WAIT_FEEDBACK_MINUTES,
	PEC_NOTIFICA_INOLTRO_DESTINATARI,
	PEC_NOTIFICA_RICEZIONE_MESSAGGIO,
	PEC_NOTIFICA_CAMBIOSTATO_MESSAGGIO,
	PEC_NOTIFICA_OBSOLETO_MESSAGGIO,
	PEC_NOTIFICA_PREFISSO_INVIO,
	PEC_NOTIFICA_PREFISSO_CAMBIO_STATO,
	PEC_NOTIFICA_PREFISSO_RICEZIONE,
	PEC_NOTIFICA_PREFISSO_OBSOLETO,
	PEC_NOTIFICA_PREFISSO_INOLTRO,
	
	PEC_NOTIFICA_ERRORE_OGGETTO,
	PEC_NOTIFICA_ERRORE_MESSAGGIO,
	/* UI */
	PEC_LAYOUT_COLUMN_MAX_CHAR
}