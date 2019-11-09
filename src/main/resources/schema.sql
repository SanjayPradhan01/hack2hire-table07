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
   ExchangeName 		varchar2(32),
   ISIN         		varchar2(32),
   StockName    		varchar2(64),
   AverageCMP   		Double,
   RealizedProfit/Loss  Double,
   UnRealizedProfit/Loss Double,
   CurrentCMP			Double
   );
   
   CREATE TABLE FX_EXCHANGE
   (
     SourceCurrency   varchar2(64),
     TargetCurrrency  varchar2(64),
     ExchangeValue    Double
     );
   