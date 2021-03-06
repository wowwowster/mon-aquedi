insert into test.user ( user_name) VALUES ('nom C')

DELETE FROM test.user WHERE user_name like '%Admin%'

CREATE SEQUENCE test.user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER TABLE test.user ALTER COLUMN user_id SET DEFAULT nextval('test.user_id_seq'::regclass) ;

CREATE TABLE unite_mesure (
    unite_mesure_id integer NOT NULL,
    cd_unite_mesure character varying,
    cd_unite_mesure_scheme_agency_id character varying,
    lb_unite_mesure character varying,
    sym_unite_mesure character varying,
    st_unite_mesure character varying,
    st_unite_mesure_list_agency_id character varying,
    date_cre_unite_mesure date,
    date_maj_unite_mesure timestamp with time zone,
    ds_unite_mesure character varying,
    auteur_unite_mesure character varying,
    ref_unite_mesure character varying,
    nom_int_unite_mesure character varying
);

CREATE SEQUENCE unite_mesure_unite_mesure_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
