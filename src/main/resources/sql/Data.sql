CREATE TABLE test.unite_mesure (
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

CREATE SEQUENCE test.unite_mesure_unite_mesure_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER TABLE test.unite_mesure ALTER COLUMN unite_mesure_id SET DEFAULT nextval('test.unite_mesure_unite_mesure_id_seq'::regclass) ;
