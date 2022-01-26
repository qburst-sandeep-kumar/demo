
-- genre master
CREATE TABLE filmdb.m_genre (
	genre_id SERIAL NOT NULL,
	genre_type varchar(30) NOT NULL,
	updated_datetime timestamp with time zone NOT NULL,
	last_updated_by varchar(25) DEFAULT 'CODE',
	PRIMARY KEY (genre_id)
) WITH ( OIDS = FALSE );


