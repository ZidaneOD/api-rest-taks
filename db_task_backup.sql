PGDMP      :         
         |            db_task    16.1    16.1                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16724    db_task    DATABASE     y   CREATE DATABASE db_task WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Peru.1252';
    DROP DATABASE db_task;
                postgres    false            �            1259    16726 
   tb_estados    TABLE     j   CREATE TABLE public.tb_estados (
    id_estado integer NOT NULL,
    nomb_estado character varying(50)
);
    DROP TABLE public.tb_estados;
       public         heap    postgres    false            �            1259    16725    tb_estados_id_estado_seq    SEQUENCE     �   CREATE SEQUENCE public.tb_estados_id_estado_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.tb_estados_id_estado_seq;
       public          postgres    false    216                       0    0    tb_estados_id_estado_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.tb_estados_id_estado_seq OWNED BY public.tb_estados.id_estado;
          public          postgres    false    215            �            1259    16733 	   tb_iconos    TABLE     g   CREATE TABLE public.tb_iconos (
    id_icono integer NOT NULL,
    nomb_icono character varying(50)
);
    DROP TABLE public.tb_iconos;
       public         heap    postgres    false            �            1259    16732    tb_iconos_id_icono_seq    SEQUENCE     �   CREATE SEQUENCE public.tb_iconos_id_icono_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.tb_iconos_id_icono_seq;
       public          postgres    false    218            	           0    0    tb_iconos_id_icono_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.tb_iconos_id_icono_seq OWNED BY public.tb_iconos.id_icono;
          public          postgres    false    217            �            1259    16748    tb_tasks    TABLE       CREATE TABLE public.tb_tasks (
    id_task character varying NOT NULL,
    nomb_task character varying(150),
    desc_task character varying(150),
    id_estado integer,
    ini_task date,
    fin_task date,
    comp_task boolean,
    id_icono integer,
    id_usua integer
);
    DROP TABLE public.tb_tasks;
       public         heap    postgres    false            �            1259    16740    tb_usuarios    TABLE     K  CREATE TABLE public.tb_usuarios (
    id_usua integer NOT NULL,
    nomb_usua character varying(100),
    appe_usua character varying(100),
    nomb_emp_usua character varying(100),
    carg_emp_usua character varying(120),
    telf_usua character(15),
    mail_usua character varying(200),
    pass_usua character varying(255)
);
    DROP TABLE public.tb_usuarios;
       public         heap    postgres    false            �            1259    16739    tb_usuarios_id_usua_seq    SEQUENCE     �   CREATE SEQUENCE public.tb_usuarios_id_usua_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.tb_usuarios_id_usua_seq;
       public          postgres    false    220            
           0    0    tb_usuarios_id_usua_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.tb_usuarios_id_usua_seq OWNED BY public.tb_usuarios.id_usua;
          public          postgres    false    219            ^           2604    16729    tb_estados id_estado    DEFAULT     |   ALTER TABLE ONLY public.tb_estados ALTER COLUMN id_estado SET DEFAULT nextval('public.tb_estados_id_estado_seq'::regclass);
 C   ALTER TABLE public.tb_estados ALTER COLUMN id_estado DROP DEFAULT;
       public          postgres    false    215    216    216            _           2604    16736    tb_iconos id_icono    DEFAULT     x   ALTER TABLE ONLY public.tb_iconos ALTER COLUMN id_icono SET DEFAULT nextval('public.tb_iconos_id_icono_seq'::regclass);
 A   ALTER TABLE public.tb_iconos ALTER COLUMN id_icono DROP DEFAULT;
       public          postgres    false    218    217    218            `           2604    16743    tb_usuarios id_usua    DEFAULT     z   ALTER TABLE ONLY public.tb_usuarios ALTER COLUMN id_usua SET DEFAULT nextval('public.tb_usuarios_id_usua_seq'::regclass);
 B   ALTER TABLE public.tb_usuarios ALTER COLUMN id_usua DROP DEFAULT;
       public          postgres    false    220    219    220            �          0    16726 
   tb_estados 
   TABLE DATA           <   COPY public.tb_estados (id_estado, nomb_estado) FROM stdin;
    public          postgres    false    216   �#       �          0    16733 	   tb_iconos 
   TABLE DATA           9   COPY public.tb_iconos (id_icono, nomb_icono) FROM stdin;
    public          postgres    false    218   $                 0    16748    tb_tasks 
   TABLE DATA           ~   COPY public.tb_tasks (id_task, nomb_task, desc_task, id_estado, ini_task, fin_task, comp_task, id_icono, id_usua) FROM stdin;
    public          postgres    false    221   B$                  0    16740    tb_usuarios 
   TABLE DATA           �   COPY public.tb_usuarios (id_usua, nomb_usua, appe_usua, nomb_emp_usua, carg_emp_usua, telf_usua, mail_usua, pass_usua) FROM stdin;
    public          postgres    false    220   �$                  0    0    tb_estados_id_estado_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.tb_estados_id_estado_seq', 1, true);
          public          postgres    false    215                       0    0    tb_iconos_id_icono_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.tb_iconos_id_icono_seq', 1, true);
          public          postgres    false    217                       0    0    tb_usuarios_id_usua_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.tb_usuarios_id_usua_seq', 1, true);
          public          postgres    false    219            b           2606    16731    tb_estados tb_estados_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.tb_estados
    ADD CONSTRAINT tb_estados_pkey PRIMARY KEY (id_estado);
 D   ALTER TABLE ONLY public.tb_estados DROP CONSTRAINT tb_estados_pkey;
       public            postgres    false    216            d           2606    16738    tb_iconos tb_iconos_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.tb_iconos
    ADD CONSTRAINT tb_iconos_pkey PRIMARY KEY (id_icono);
 B   ALTER TABLE ONLY public.tb_iconos DROP CONSTRAINT tb_iconos_pkey;
       public            postgres    false    218            h           2606    16754    tb_tasks tb_tasks_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.tb_tasks
    ADD CONSTRAINT tb_tasks_pkey PRIMARY KEY (id_task);
 @   ALTER TABLE ONLY public.tb_tasks DROP CONSTRAINT tb_tasks_pkey;
       public            postgres    false    221            f           2606    16747    tb_usuarios tb_usuarios_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.tb_usuarios
    ADD CONSTRAINT tb_usuarios_pkey PRIMARY KEY (id_usua);
 F   ALTER TABLE ONLY public.tb_usuarios DROP CONSTRAINT tb_usuarios_pkey;
       public            postgres    false    220            i           2606    16755     tb_tasks tb_tasks_id_estado_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.tb_tasks
    ADD CONSTRAINT tb_tasks_id_estado_fkey FOREIGN KEY (id_estado) REFERENCES public.tb_estados(id_estado);
 J   ALTER TABLE ONLY public.tb_tasks DROP CONSTRAINT tb_tasks_id_estado_fkey;
       public          postgres    false    216    4706    221            j           2606    16760    tb_tasks tb_tasks_id_icono_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.tb_tasks
    ADD CONSTRAINT tb_tasks_id_icono_fkey FOREIGN KEY (id_icono) REFERENCES public.tb_iconos(id_icono);
 I   ALTER TABLE ONLY public.tb_tasks DROP CONSTRAINT tb_tasks_id_icono_fkey;
       public          postgres    false    221    218    4708            k           2606    16765    tb_tasks tb_tasks_id_usua_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.tb_tasks
    ADD CONSTRAINT tb_tasks_id_usua_fkey FOREIGN KEY (id_usua) REFERENCES public.tb_usuarios(id_usua);
 H   ALTER TABLE ONLY public.tb_tasks DROP CONSTRAINT tb_tasks_id_usua_fkey;
       public          postgres    false    4710    221    220            �      x�3��q��t�tvt�<<ُ+F��� D�      �      x�3�tv
pq����� U�         ^   x�sq�5�(ʯLM.�WHIUp,(�tI-N,*���IL�WH�S�J,KT04W�U.(��KWH��/�4�4202�50�5��38Ӏ2�\1z\\\ f�$          V   x�3���KMbN����*���*N��t�ĲL�������TNmSCK3#ScccΪ̔ļT��������\NC#c�=... �,+     