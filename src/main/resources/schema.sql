create table user
(
   username varchar2(255) not null,
   password varchar2(255) not null,
   primary key(username)
);


CREATE TABLE DBS_PORTFOLIO_TRANSACTION
(
  ExchangeName      varchar2(32) NOT NULL,
  ExternalSourceId  varchar2(64) NOT NULL,
  ISIN 				varchar2(32),
  StockName 		varchar2(255),
  Quantity          Number,
  Operation			varchar2(32),
  Price				Double,
  IsIntraDay        Integer,
  SourceSystem      varchar2(64),
  CreationDate      timestamp,
  Currency          varchar2(32),
  RowId             Number,  
);


CREATE TABLE DBS_PORTFOLIO_SUMMARY
(
   id					integer not null;
   exchangename 		varchar2(32),
   isin         		varchar2(32),
   stockname    		varchar2(64),
   averagecmp   		Double,
   realizedprofitloss  Double,
   unrealizedprofitloss Double,
   currentcmp			Double,
   primary key(id)
   );
   
   CREATE TABLE FX_EXCHANGE
   (
     SourceCurrency   varchar2(64),
     TargetCurrrency  varchar2(64),
     ExchangeValue    Double
     );
   