CREATE TABLE IF NOT EXISTS causas_riesgos (
    "id" BIGSERIAL PRIMARY KEY,
    "causa_riesgo" VARCHAR NOT NULL,
    "descripcion" VARCHAR
);

CREATE TABLE IF NOT EXISTS impacto_riesgos (
    "id" BIGSERIAL PRIMARY KEY,
    "impacto" VARCHAR NOT NULL,
    "puntaje" INTEGER NOT NULL,
    "descripcion" VARCHAR
);

CREATE TABLE IF NOT EXISTS probabilidad_riesgos (
    "id" BIGSERIAL PRIMARY KEY,
    "probabilidad" VARCHAR NOT NULL,
    "puntaje" INTEGER NOT NULL,
    "descripcion" VARCHAR
);

CREATE TABLE IF NOT EXISTS tipo_riesgos (
    "id" BIGSERIAL PRIMARY KEY,
    "tipo_riesgo" VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS calificacion_riesgos (
    "id" BIGSERIAL PRIMARY KEY,
    "nombre_calificacion_riesgo" VARCHAR NOT NULL,
    "rango_minimo" INTEGER NOT NULL,
    "rango_maximo" INTEGER NOT NULL ,
    "color" VARCHAR NOT NULL,
    "accion_tomar" VARCHAR NOT NULL
);