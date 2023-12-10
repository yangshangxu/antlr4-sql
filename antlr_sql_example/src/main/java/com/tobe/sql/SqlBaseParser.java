// Generated from C:/Users/Zebro/Desktop/develop/antlr/code_examples/antlr_sql_example/src/main/resources/com.tobe.sql/SqlBase.g4 by ANTLR 4.13.1
package com.tobe.sql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SELECT=10, FROM=11, ADD=12, AS=13, ALL=14, DISTINCT=15, WHERE=16, GROUP=17, 
		BY=18, GROUPING=19, SETS=20, CUBE=21, ROLLUP=22, ORDER=23, HAVING=24, 
		LIMIT=25, AT=26, OR=27, AND=28, IN=29, NOT=30, NO=31, EXISTS=32, BETWEEN=33, 
		LIKE=34, RLIKE=35, IS=36, NULL=37, TRUE=38, FALSE=39, NULLS=40, ASC=41, 
		DESC=42, FOR=43, INTERVAL=44, CASE=45, WHEN=46, THEN=47, ELSE=48, END=49, 
		JOIN=50, CROSS=51, OUTER=52, INNER=53, LEFT=54, SEMI=55, RIGHT=56, FULL=57, 
		NATURAL=58, ON=59, LATERAL=60, WINDOW=61, OVER=62, PARTITION=63, RANGE=64, 
		ROWS=65, UNBOUNDED=66, PRECEDING=67, FOLLOWING=68, CURRENT=69, FIRST=70, 
		AFTER=71, LAST=72, ROW=73, WITH=74, VALUES=75, CREATE=76, TABLE=77, DIRECTORY=78, 
		VIEW=79, REPLACE=80, INSERT=81, DELETE=82, INTO=83, DESCRIBE=84, EXPLAIN=85, 
		FORMAT=86, LOGICAL=87, CODEGEN=88, COST=89, CAST=90, SHOW=91, TABLES=92, 
		COLUMNS=93, COLUMN=94, USE=95, PARTITIONS=96, FUNCTIONS=97, DROP=98, UNION=99, 
		EXCEPT=100, SETMINUS=101, INTERSECT=102, TO=103, TABLESAMPLE=104, STRATIFY=105, 
		ALTER=106, RENAME=107, ARRAY=108, MAP=109, STRUCT=110, COMMENT=111, SET=112, 
		RESET=113, DATA=114, START=115, TRANSACTION=116, COMMIT=117, ROLLBACK=118, 
		MACRO=119, IGNORE=120, BOTH=121, LEADING=122, TRAILING=123, IF=124, POSITION=125, 
		EQ=126, NSEQ=127, NEQ=128, NEQJ=129, LT=130, LTE=131, GT=132, GTE=133, 
		PLUS=134, MINUS=135, ASTERISK=136, SLASH=137, PERCENT=138, DIV=139, TILDE=140, 
		AMPERSAND=141, PIPE=142, CONCAT_PIPE=143, HAT=144, PERCENTLIT=145, BUCKET=146, 
		OUT=147, OF=148, SORT=149, CLUSTER=150, DISTRIBUTE=151, OVERWRITE=152, 
		TRANSFORM=153, REDUCE=154, USING=155, SERDE=156, SERDEPROPERTIES=157, 
		RECORDREADER=158, RECORDWRITER=159, DELIMITED=160, FIELDS=161, TERMINATED=162, 
		COLLECTION=163, ITEMS=164, KEYS=165, ESCAPED=166, LINES=167, SEPARATED=168, 
		FUNCTION=169, EXTENDED=170, REFRESH=171, CLEAR=172, CACHE=173, UNCACHE=174, 
		LAZY=175, FORMATTED=176, GLOBAL=177, TEMPORARY=178, OPTIONS=179, UNSET=180, 
		TBLPROPERTIES=181, DBPROPERTIES=182, BUCKETS=183, SKEWED=184, STORED=185, 
		DIRECTORIES=186, LOCATION=187, EXCHANGE=188, ARCHIVE=189, UNARCHIVE=190, 
		FILEFORMAT=191, TOUCH=192, COMPACT=193, CONCATENATE=194, CHANGE=195, CASCADE=196, 
		RESTRICT=197, CLUSTERED=198, SORTED=199, PURGE=200, INPUTFORMAT=201, OUTPUTFORMAT=202, 
		DATABASE=203, DATABASES=204, DFS=205, TRUNCATE=206, ANALYZE=207, COMPUTE=208, 
		LIST=209, STATISTICS=210, PARTITIONED=211, EXTERNAL=212, DEFINED=213, 
		REVOKE=214, GRANT=215, LOCK=216, UNLOCK=217, MSCK=218, REPAIR=219, RECOVER=220, 
		EXPORT=221, IMPORT=222, LOAD=223, ROLE=224, ROLES=225, COMPACTIONS=226, 
		PRINCIPALS=227, TRANSACTIONS=228, INDEX=229, INDEXES=230, LOCKS=231, OPTION=232, 
		ANTI=233, LOCAL=234, INPATH=235, CURRENT_DATE=236, CURRENT_TIMESTAMP=237, 
		STRING=238, BIGINT_LITERAL=239, SMALLINT_LITERAL=240, TINYINT_LITERAL=241, 
		BYTELENGTH_LITERAL=242, INTEGER_VALUE=243, DECIMAL_VALUE=244, DOUBLE_LITERAL=245, 
		BIGDECIMAL_LITERAL=246, IDENTIFIER=247, BACKQUOTED_IDENTIFIER=248, SIMPLE_COMMENT=249, 
		BRACKETED_EMPTY_COMMENT=250, BRACKETED_COMMENT=251, WS=252, UNRECOGNIZED=253, 
		DELIMITER=254;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleFunctionIdentifier = 3, RULE_singleDataType = 4, RULE_singleTableSchema = 5, 
		RULE_statement = 6, RULE_unsupportedHiveNativeCommands = 7, RULE_createTableHeader = 8, 
		RULE_bucketSpec = 9, RULE_skewSpec = 10, RULE_locationSpec = 11, RULE_query = 12, 
		RULE_insertInto = 13, RULE_partitionSpecLocation = 14, RULE_partitionSpec = 15, 
		RULE_partitionVal = 16, RULE_describeFuncName = 17, RULE_describeColName = 18, 
		RULE_ctes = 19, RULE_namedQuery = 20, RULE_tableProvider = 21, RULE_tablePropertyList = 22, 
		RULE_tableProperty = 23, RULE_tablePropertyKey = 24, RULE_tablePropertyValue = 25, 
		RULE_constantList = 26, RULE_nestedConstantList = 27, RULE_createFileFormat = 28, 
		RULE_fileFormat = 29, RULE_storageHandler = 30, RULE_resource = 31, RULE_queryNoWith = 32, 
		RULE_queryOrganization = 33, RULE_multiInsertQueryBody = 34, RULE_queryTerm = 35, 
		RULE_queryPrimary = 36, RULE_sortItem = 37, RULE_querySpecification = 38, 
		RULE_hint = 39, RULE_hintStatement = 40, RULE_fromClause = 41, RULE_aggregation = 42, 
		RULE_groupingSet = 43, RULE_lateralView = 44, RULE_setQuantifier = 45, 
		RULE_relation = 46, RULE_joinRelation = 47, RULE_joinType = 48, RULE_joinCriteria = 49, 
		RULE_sample = 50, RULE_identifierList = 51, RULE_identifierSeq = 52, RULE_orderedIdentifierList = 53, 
		RULE_orderedIdentifier = 54, RULE_identifierCommentList = 55, RULE_identifierComment = 56, 
		RULE_relationPrimary = 57, RULE_inlineTable = 58, RULE_functionTable = 59, 
		RULE_tableAlias = 60, RULE_rowFormat = 61, RULE_tableIdentifier = 62, 
		RULE_functionIdentifier = 63, RULE_namedExpression = 64, RULE_namedExpressionSeq = 65, 
		RULE_expression = 66, RULE_booleanExpression = 67, RULE_predicated = 68, 
		RULE_predicate = 69, RULE_valueExpression = 70, RULE_primaryExpression = 71, 
		RULE_constant = 72, RULE_comparisonOperator = 73, RULE_arithmeticOperator = 74, 
		RULE_predicateOperator = 75, RULE_booleanValue = 76, RULE_interval = 77, 
		RULE_intervalField = 78, RULE_intervalValue = 79, RULE_colPosition = 80, 
		RULE_dataType = 81, RULE_colTypeList = 82, RULE_colType = 83, RULE_complexColTypeList = 84, 
		RULE_complexColType = 85, RULE_whenClause = 86, RULE_windows = 87, RULE_namedWindow = 88, 
		RULE_windowSpec = 89, RULE_windowFrame = 90, RULE_frameBound = 91, RULE_qualifiedName = 92, 
		RULE_identifier = 93, RULE_strictIdentifier = 94, RULE_quotedIdentifier = 95, 
		RULE_number = 96, RULE_nonReserved = 97;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleFunctionIdentifier", 
			"singleDataType", "singleTableSchema", "statement", "unsupportedHiveNativeCommands", 
			"createTableHeader", "bucketSpec", "skewSpec", "locationSpec", "query", 
			"insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
			"describeFuncName", "describeColName", "ctes", "namedQuery", "tableProvider", 
			"tablePropertyList", "tableProperty", "tablePropertyKey", "tablePropertyValue", 
			"constantList", "nestedConstantList", "createFileFormat", "fileFormat", 
			"storageHandler", "resource", "queryNoWith", "queryOrganization", "multiInsertQueryBody", 
			"queryTerm", "queryPrimary", "sortItem", "querySpecification", "hint", 
			"hintStatement", "fromClause", "aggregation", "groupingSet", "lateralView", 
			"setQuantifier", "relation", "joinRelation", "joinType", "joinCriteria", 
			"sample", "identifierList", "identifierSeq", "orderedIdentifierList", 
			"orderedIdentifier", "identifierCommentList", "identifierComment", "relationPrimary", 
			"inlineTable", "functionTable", "tableAlias", "rowFormat", "tableIdentifier", 
			"functionIdentifier", "namedExpression", "namedExpressionSeq", "expression", 
			"booleanExpression", "predicated", "predicate", "valueExpression", "primaryExpression", 
			"constant", "comparisonOperator", "arithmeticOperator", "predicateOperator", 
			"booleanValue", "interval", "intervalField", "intervalValue", "colPosition", 
			"dataType", "colTypeList", "colType", "complexColTypeList", "complexColType", 
			"whenClause", "windows", "namedWindow", "windowSpec", "windowFrame", 
			"frameBound", "qualifiedName", "identifier", "strictIdentifier", "quotedIdentifier", 
			"number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'['", "']'", "':'", 
			"'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'DISTINCT'", "'WHERE'", 
			"'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", 
			"'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", 
			"'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", 
			"'FALSE'", "'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", 
			"'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", 
			"'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", 
			"'LATERAL'", "'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", "'ROWS'", 
			"'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", 
			"'AFTER'", "'LAST'", "'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", 
			"'DIRECTORY'", "'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", 
			"'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", "'LOGICAL'", "'CODEGEN'", "'COST'", 
			"'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", 
			"'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'MINUS'", "'INTERSECT'", 
			"'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", "'RENAME'", "'ARRAY'", 
			"'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", "'DATA'", "'START'", 
			"'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", "'IGNORE'", "'BOTH'", 
			"'LEADING'", "'TRAILING'", "'IF'", "'POSITION'", null, "'<=>'", "'<>'", 
			"'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", "'PERCENT'", "'BUCKET'", 
			"'OUT'", "'OF'", "'SORT'", "'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'", 
			"'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", "'SERDEPROPERTIES'", 
			"'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", "'FIELDS'", "'TERMINATED'", 
			"'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", 
			"'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", 
			"'LAZY'", "'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", 
			"'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", 
			"'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", 
			"'TOUCH'", "'COMPACT'", "'CONCATENATE'", "'CHANGE'", "'CASCADE'", "'RESTRICT'", 
			"'CLUSTERED'", "'SORTED'", "'PURGE'", "'INPUTFORMAT'", "'OUTPUTFORMAT'", 
			null, null, "'DFS'", "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'", 
			"'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", "'DEFINED'", "'REVOKE'", 
			"'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", "'RECOVER'", "'EXPORT'", 
			"'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", 
			"'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", 
			"'LOCAL'", "'INPATH'", "'CURRENT_DATE'", "'CURRENT_TIMESTAMP'", null, 
			null, null, null, null, null, null, null, null, null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "SELECT", 
			"FROM", "ADD", "AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", 
			"SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", 
			"IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", "NULL", 
			"TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", "CASE", "WHEN", 
			"THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "SEMI", 
			"RIGHT", "FULL", "NATURAL", "ON", "LATERAL", "WINDOW", "OVER", "PARTITION", 
			"RANGE", "ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "FIRST", 
			"AFTER", "LAST", "ROW", "WITH", "VALUES", "CREATE", "TABLE", "DIRECTORY", 
			"VIEW", "REPLACE", "INSERT", "DELETE", "INTO", "DESCRIBE", "EXPLAIN", 
			"FORMAT", "LOGICAL", "CODEGEN", "COST", "CAST", "SHOW", "TABLES", "COLUMNS", 
			"COLUMN", "USE", "PARTITIONS", "FUNCTIONS", "DROP", "UNION", "EXCEPT", 
			"SETMINUS", "INTERSECT", "TO", "TABLESAMPLE", "STRATIFY", "ALTER", "RENAME", 
			"ARRAY", "MAP", "STRUCT", "COMMENT", "SET", "RESET", "DATA", "START", 
			"TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", "IGNORE", "BOTH", "LEADING", 
			"TRAILING", "IF", "POSITION", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", 
			"GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", 
			"TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "PERCENTLIT", "BUCKET", 
			"OUT", "OF", "SORT", "CLUSTER", "DISTRIBUTE", "OVERWRITE", "TRANSFORM", 
			"REDUCE", "USING", "SERDE", "SERDEPROPERTIES", "RECORDREADER", "RECORDWRITER", 
			"DELIMITED", "FIELDS", "TERMINATED", "COLLECTION", "ITEMS", "KEYS", "ESCAPED", 
			"LINES", "SEPARATED", "FUNCTION", "EXTENDED", "REFRESH", "CLEAR", "CACHE", 
			"UNCACHE", "LAZY", "FORMATTED", "GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", 
			"TBLPROPERTIES", "DBPROPERTIES", "BUCKETS", "SKEWED", "STORED", "DIRECTORIES", 
			"LOCATION", "EXCHANGE", "ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", 
			"COMPACT", "CONCATENATE", "CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", 
			"SORTED", "PURGE", "INPUTFORMAT", "OUTPUTFORMAT", "DATABASE", "DATABASES", 
			"DFS", "TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "STATISTICS", "PARTITIONED", 
			"EXTERNAL", "DEFINED", "REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", 
			"RECOVER", "EXPORT", "IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", 
			"PRINCIPALS", "TRANSACTIONS", "INDEX", "INDEXES", "LOCKS", "OPTION", 
			"ANTI", "LOCAL", "INPATH", "CURRENT_DATE", "CURRENT_TIMESTAMP", "STRING", 
			"BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "BYTELENGTH_LITERAL", 
			"INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", 
			"IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED", "DELIMITER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is folllowed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			statement();
			setState(197);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			namedExpression();
			setState(200);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			tableIdentifier();
			setState(203);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			functionIdentifier();
			setState(206);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			dataType();
			setState(209);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			colTypeList();
			setState(212);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropDatabaseContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeDatabaseContext extends StatementContext {
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UseContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTablesContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateDatabaseContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public SkewSpecContext skewSpec() {
			return getRuleContext(SkewSpecContext.class,0);
		}
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateHiveTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateHiveTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTableContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetDatabasePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetDatabaseProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetDatabaseProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetDatabaseProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableContext extends StatementContext {
		public TablePropertyListContext options;
		public IdentifierListContext partitionColumnNames;
		public Token comment;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChangeColumnContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public ChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowDatabases(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CacheTableContext extends StatementContext {
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddTableColumnsContext extends StatementContext {
		public ColTypeListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(USE);
				setState(216);
				((UseContext)_localctx).db = identifier();
				}
				break;
			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(CREATE);
				setState(218);
				match(DATABASE);
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(219);
					match(IF);
					setState(220);
					match(NOT);
					setState(221);
					match(EXISTS);
					}
					break;
				}
				setState(224);
				identifier();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(225);
					match(COMMENT);
					setState(226);
					((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(229);
					locationSpec();
					}
				}

				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(232);
					match(WITH);
					setState(233);
					match(DBPROPERTIES);
					setState(234);
					tablePropertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(ALTER);
				setState(238);
				match(DATABASE);
				setState(239);
				identifier();
				setState(240);
				match(SET);
				setState(241);
				match(DBPROPERTIES);
				setState(242);
				tablePropertyList();
				}
				break;
			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(DROP);
				setState(245);
				match(DATABASE);
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(246);
					match(IF);
					setState(247);
					match(EXISTS);
					}
					break;
				}
				setState(250);
				identifier();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(251);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				createTableHeader();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(255);
					match(T__0);
					setState(256);
					colTypeList();
					setState(257);
					match(T__1);
					}
				}

				setState(261);
				tableProvider();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(262);
					match(OPTIONS);
					setState(263);
					((CreateTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(266);
					match(PARTITIONED);
					setState(267);
					match(BY);
					setState(268);
					((CreateTableContext)_localctx).partitionColumnNames = identifierList();
					}
				}

				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(271);
					bucketSpec();
					}
				}

				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(274);
					locationSpec();
					}
				}

				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(277);
					match(COMMENT);
					setState(278);
					((CreateTableContext)_localctx).comment = match(STRING);
					}
				}

				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(281);
					match(TBLPROPERTIES);
					setState(282);
					((CreateTableContext)_localctx).tableProps = tablePropertyList();
					}
				}

				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11266L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 34359738507L) != 0) || _la==REDUCE) {
					{
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(285);
						match(AS);
						}
					}

					setState(288);
					query();
					}
				}

				}
				break;
			case 7:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(291);
				createTableHeader();
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(292);
					match(T__0);
					setState(293);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(294);
					match(T__1);
					}
					break;
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(298);
					match(COMMENT);
					setState(299);
					((CreateHiveTableContext)_localctx).comment = match(STRING);
					}
				}

				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(302);
					match(PARTITIONED);
					setState(303);
					match(BY);
					setState(304);
					match(T__0);
					setState(305);
					((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
					setState(306);
					match(T__1);
					}
				}

				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(310);
					bucketSpec();
					}
				}

				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SKEWED) {
					{
					setState(313);
					skewSpec();
					}
				}

				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(316);
					rowFormat();
					}
				}

				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(319);
					createFileFormat();
					}
				}

				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(322);
					locationSpec();
					}
				}

				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(325);
					match(TBLPROPERTIES);
					setState(326);
					tablePropertyList();
					}
				}

				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11266L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 34359738507L) != 0) || _la==REDUCE) {
					{
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(329);
						match(AS);
						}
					}

					setState(332);
					query();
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(335);
				match(CREATE);
				setState(336);
				match(TABLE);
				setState(340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(337);
					match(IF);
					setState(338);
					match(NOT);
					setState(339);
					match(EXISTS);
					}
					break;
				}
				setState(342);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(343);
				match(LIKE);
				setState(344);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(345);
					locationSpec();
					}
				}

				}
				break;
			case 9:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(348);
				match(ANALYZE);
				setState(349);
				match(TABLE);
				setState(350);
				tableIdentifier();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(351);
					partitionSpec();
					}
				}

				setState(354);
				match(COMPUTE);
				setState(355);
				match(STATISTICS);
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(356);
					identifier();
					}
					break;
				case 2:
					{
					setState(357);
					match(FOR);
					setState(358);
					match(COLUMNS);
					setState(359);
					identifierSeq();
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(362);
				match(ALTER);
				setState(363);
				match(TABLE);
				setState(364);
				tableIdentifier();
				setState(365);
				match(ADD);
				setState(366);
				match(COLUMNS);
				setState(367);
				match(T__0);
				setState(368);
				((AddTableColumnsContext)_localctx).columns = colTypeList();
				setState(369);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(371);
				match(ALTER);
				setState(372);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(373);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(374);
				match(RENAME);
				setState(375);
				match(TO);
				setState(376);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(378);
				match(ALTER);
				setState(379);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(380);
				tableIdentifier();
				setState(381);
				match(SET);
				setState(382);
				match(TBLPROPERTIES);
				setState(383);
				tablePropertyList();
				}
				break;
			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(385);
				match(ALTER);
				setState(386);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(387);
				tableIdentifier();
				setState(388);
				match(UNSET);
				setState(389);
				match(TBLPROPERTIES);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(390);
					match(IF);
					setState(391);
					match(EXISTS);
					}
				}

				setState(394);
				tablePropertyList();
				}
				break;
			case 14:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(396);
				match(ALTER);
				setState(397);
				match(TABLE);
				setState(398);
				tableIdentifier();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(399);
					partitionSpec();
					}
				}

				setState(402);
				match(CHANGE);
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(403);
					match(COLUMN);
					}
					break;
				}
				setState(406);
				identifier();
				setState(407);
				colType();
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(408);
					colPosition();
					}
				}

				}
				break;
			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(411);
				match(ALTER);
				setState(412);
				match(TABLE);
				setState(413);
				tableIdentifier();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(414);
					partitionSpec();
					}
				}

				setState(417);
				match(SET);
				setState(418);
				match(SERDE);
				setState(419);
				match(STRING);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(420);
					match(WITH);
					setState(421);
					match(SERDEPROPERTIES);
					setState(422);
					tablePropertyList();
					}
				}

				}
				break;
			case 16:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(425);
				match(ALTER);
				setState(426);
				match(TABLE);
				setState(427);
				tableIdentifier();
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(428);
					partitionSpec();
					}
				}

				setState(431);
				match(SET);
				setState(432);
				match(SERDEPROPERTIES);
				setState(433);
				tablePropertyList();
				}
				break;
			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(435);
				match(ALTER);
				setState(436);
				match(TABLE);
				setState(437);
				tableIdentifier();
				setState(438);
				match(ADD);
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(439);
					match(IF);
					setState(440);
					match(NOT);
					setState(441);
					match(EXISTS);
					}
				}

				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(444);
					partitionSpecLocation();
					}
					}
					setState(447); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 18:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(449);
				match(ALTER);
				setState(450);
				match(VIEW);
				setState(451);
				tableIdentifier();
				setState(452);
				match(ADD);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(453);
					match(IF);
					setState(454);
					match(NOT);
					setState(455);
					match(EXISTS);
					}
				}

				setState(459); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(458);
					partitionSpec();
					}
					}
					setState(461); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 19:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(463);
				match(ALTER);
				setState(464);
				match(TABLE);
				setState(465);
				tableIdentifier();
				setState(466);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(467);
				match(RENAME);
				setState(468);
				match(TO);
				setState(469);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(471);
				match(ALTER);
				setState(472);
				match(TABLE);
				setState(473);
				tableIdentifier();
				setState(474);
				match(DROP);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(475);
					match(IF);
					setState(476);
					match(EXISTS);
					}
				}

				setState(479);
				partitionSpec();
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(480);
					match(T__2);
					setState(481);
					partitionSpec();
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(487);
					match(PURGE);
					}
				}

				}
				break;
			case 21:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(490);
				match(ALTER);
				setState(491);
				match(VIEW);
				setState(492);
				tableIdentifier();
				setState(493);
				match(DROP);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(494);
					match(IF);
					setState(495);
					match(EXISTS);
					}
				}

				setState(498);
				partitionSpec();
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(499);
					match(T__2);
					setState(500);
					partitionSpec();
					}
					}
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 22:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(506);
				match(ALTER);
				setState(507);
				match(TABLE);
				setState(508);
				tableIdentifier();
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(509);
					partitionSpec();
					}
				}

				setState(512);
				match(SET);
				setState(513);
				locationSpec();
				}
				break;
			case 23:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(515);
				match(ALTER);
				setState(516);
				match(TABLE);
				setState(517);
				tableIdentifier();
				setState(518);
				match(RECOVER);
				setState(519);
				match(PARTITIONS);
				}
				break;
			case 24:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(521);
				match(DROP);
				setState(522);
				match(TABLE);
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(523);
					match(IF);
					setState(524);
					match(EXISTS);
					}
					break;
				}
				setState(527);
				tableIdentifier();
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(528);
					match(PURGE);
					}
				}

				}
				break;
			case 25:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(531);
				match(DROP);
				setState(532);
				match(VIEW);
				setState(535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(533);
					match(IF);
					setState(534);
					match(EXISTS);
					}
					break;
				}
				setState(537);
				tableIdentifier();
				}
				break;
			case 26:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(538);
				match(CREATE);
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(539);
					match(OR);
					setState(540);
					match(REPLACE);
					}
				}

				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(543);
						match(GLOBAL);
						}
					}

					setState(546);
					match(TEMPORARY);
					}
				}

				setState(549);
				match(VIEW);
				setState(553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(550);
					match(IF);
					setState(551);
					match(NOT);
					setState(552);
					match(EXISTS);
					}
					break;
				}
				setState(555);
				tableIdentifier();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(556);
					identifierCommentList();
					}
				}

				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(559);
					match(COMMENT);
					setState(560);
					match(STRING);
					}
				}

				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(563);
					match(PARTITIONED);
					setState(564);
					match(ON);
					setState(565);
					identifierList();
					}
				}

				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(568);
					match(TBLPROPERTIES);
					setState(569);
					tablePropertyList();
					}
				}

				setState(572);
				match(AS);
				setState(573);
				query();
				}
				break;
			case 27:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(575);
				match(CREATE);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(576);
					match(OR);
					setState(577);
					match(REPLACE);
					}
				}

				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(580);
					match(GLOBAL);
					}
				}

				setState(583);
				match(TEMPORARY);
				setState(584);
				match(VIEW);
				setState(585);
				tableIdentifier();
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(586);
					match(T__0);
					setState(587);
					colTypeList();
					setState(588);
					match(T__1);
					}
				}

				setState(592);
				tableProvider();
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(593);
					match(OPTIONS);
					setState(594);
					tablePropertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(597);
				match(ALTER);
				setState(598);
				match(VIEW);
				setState(599);
				tableIdentifier();
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(600);
					match(AS);
					}
				}

				setState(603);
				query();
				}
				break;
			case 29:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(605);
				match(CREATE);
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(606);
					match(OR);
					setState(607);
					match(REPLACE);
					}
				}

				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(610);
					match(TEMPORARY);
					}
				}

				setState(613);
				match(FUNCTION);
				setState(617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(614);
					match(IF);
					setState(615);
					match(NOT);
					setState(616);
					match(EXISTS);
					}
					break;
				}
				setState(619);
				qualifiedName();
				setState(620);
				match(AS);
				setState(621);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(622);
					match(USING);
					setState(623);
					resource();
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(624);
						match(T__2);
						setState(625);
						resource();
						}
						}
						setState(630);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 30:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(633);
				match(DROP);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(634);
					match(TEMPORARY);
					}
				}

				setState(637);
				match(FUNCTION);
				setState(640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(638);
					match(IF);
					setState(639);
					match(EXISTS);
					}
					break;
				}
				setState(642);
				qualifiedName();
				}
				break;
			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(643);
				match(EXPLAIN);
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0) || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(644);
					_la = _input.LA(1);
					if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 7L) != 0) || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(647);
				statement();
				}
				break;
			case 32:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(648);
				match(SHOW);
				setState(649);
				match(TABLES);
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(650);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(651);
					((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(654);
						match(LIKE);
						}
					}

					setState(657);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 33:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(660);
				match(SHOW);
				setState(661);
				match(TABLE);
				setState(662);
				match(EXTENDED);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(663);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(664);
					((ShowTableContext)_localctx).db = identifier();
					}
				}

				setState(667);
				match(LIKE);
				setState(668);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(669);
					partitionSpec();
					}
				}

				}
				break;
			case 34:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(672);
				match(SHOW);
				setState(673);
				match(DATABASES);
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(674);
					match(LIKE);
					setState(675);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(678);
				match(SHOW);
				setState(679);
				match(TBLPROPERTIES);
				setState(680);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(681);
					match(T__0);
					setState(682);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(683);
					match(T__1);
					}
				}

				}
				break;
			case 36:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(687);
				match(SHOW);
				setState(688);
				match(COLUMNS);
				setState(689);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(690);
				tableIdentifier();
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(691);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(692);
					((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;
			case 37:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(695);
				match(SHOW);
				setState(696);
				match(PARTITIONS);
				setState(697);
				tableIdentifier();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(698);
					partitionSpec();
					}
				}

				}
				break;
			case 38:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(701);
				match(SHOW);
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(702);
					identifier();
					}
					break;
				}
				setState(705);
				match(FUNCTIONS);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1024L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & -65599L) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & 52845277609983L) != 0)) {
					{
					setState(707);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(706);
						match(LIKE);
						}
						break;
					}
					setState(711);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case FIRST:
					case AFTER:
					case LAST:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case DIRECTORY:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case COST:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case SETMINUS:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IGNORE:
					case BOTH:
					case LEADING:
					case TRAILING:
					case IF:
					case POSITION:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case GLOBAL:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case RECOVER:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case CURRENT_DATE:
					case CURRENT_TIMESTAMP:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
						{
						setState(709);
						qualifiedName();
						}
						break;
					case STRING:
						{
						setState(710);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 39:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(715);
				match(SHOW);
				setState(716);
				match(CREATE);
				setState(717);
				match(TABLE);
				setState(718);
				tableIdentifier();
				}
				break;
			case 40:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(719);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(720);
				match(FUNCTION);
				setState(722);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(721);
					match(EXTENDED);
					}
					break;
				}
				setState(724);
				describeFuncName();
				}
				break;
			case 41:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(725);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(726);
				match(DATABASE);
				setState(728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(727);
					match(EXTENDED);
					}
					break;
				}
				setState(730);
				identifier();
				}
				break;
			case 42:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(731);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(732);
					match(TABLE);
					}
					break;
				}
				setState(736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(735);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(738);
				tableIdentifier();
				setState(740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(739);
					partitionSpec();
					}
					break;
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1024L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & -65599L) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & 52810917871615L) != 0)) {
					{
					setState(742);
					describeColName();
					}
				}

				}
				break;
			case 43:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(745);
				match(REFRESH);
				setState(746);
				match(TABLE);
				setState(747);
				tableIdentifier();
				}
				break;
			case 44:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(748);
				match(REFRESH);
				setState(756);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(749);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(753);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(750);
							matchWildcard();
							}
							} 
						}
						setState(755);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 45:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(758);
				match(CACHE);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(759);
					match(LAZY);
					}
				}

				setState(762);
				match(TABLE);
				setState(763);
				tableIdentifier();
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11266L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 34359738507L) != 0) || _la==REDUCE) {
					{
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(764);
						match(AS);
						}
					}

					setState(767);
					query();
					}
				}

				}
				break;
			case 46:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(770);
				match(UNCACHE);
				setState(771);
				match(TABLE);
				setState(774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(772);
					match(IF);
					setState(773);
					match(EXISTS);
					}
					break;
				}
				setState(776);
				tableIdentifier();
				}
				break;
			case 47:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(777);
				match(CLEAR);
				setState(778);
				match(CACHE);
				}
				break;
			case 48:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(779);
				match(LOAD);
				setState(780);
				match(DATA);
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(781);
					match(LOCAL);
					}
				}

				setState(784);
				match(INPATH);
				setState(785);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(786);
					match(OVERWRITE);
					}
				}

				setState(789);
				match(INTO);
				setState(790);
				match(TABLE);
				setState(791);
				tableIdentifier();
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(792);
					partitionSpec();
					}
				}

				}
				break;
			case 49:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(795);
				match(TRUNCATE);
				setState(796);
				match(TABLE);
				setState(797);
				tableIdentifier();
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(798);
					partitionSpec();
					}
				}

				}
				break;
			case 50:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(801);
				match(MSCK);
				setState(802);
				match(REPAIR);
				setState(803);
				match(TABLE);
				setState(804);
				tableIdentifier();
				}
				break;
			case 51:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(805);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(806);
				identifier();
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(807);
						matchWildcard();
						}
						} 
					}
					setState(812);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
				break;
			case 52:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(813);
				match(SET);
				setState(814);
				match(ROLE);
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(815);
						matchWildcard();
						}
						} 
					}
					setState(820);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				}
				break;
			case 53:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(821);
				match(SET);
				setState(825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(822);
						matchWildcard();
						}
						} 
					}
					setState(827);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				break;
			case 54:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(828);
				match(RESET);
				}
				break;
			case 55:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(829);
				unsupportedHiveNativeCommands();
				setState(833);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(830);
						matchWildcard();
						}
						} 
					}
					setState(835);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(839);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(841);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(843);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(846);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(847);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(850);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(851);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(852);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(853);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(854);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(857);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(858);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(859);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(860);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(861);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(862);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(863);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(864);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(865);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(866);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(867);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(868);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(869);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(870);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(871);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(872);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(873);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(874);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(875);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(876);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(877);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(878);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(879);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(880);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(881);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(882);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(883);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(884);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(885);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(886);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(887);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(888);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(889);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(890);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(891);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(892);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(893);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(894);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(895);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(896);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(897);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(898);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(899);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(900);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(901);
				tableIdentifier();
				setState(902);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(903);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(905);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(906);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(907);
				tableIdentifier();
				setState(908);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(909);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(911);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(912);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(913);
				tableIdentifier();
				setState(914);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(915);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(917);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(918);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(919);
				tableIdentifier();
				setState(920);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(921);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(923);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(924);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(925);
				tableIdentifier();
				setState(926);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(927);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(929);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(930);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(931);
				tableIdentifier();
				setState(932);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(933);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(934);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(935);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(937);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(938);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(939);
				tableIdentifier();
				setState(940);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(941);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(942);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(944);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(945);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(946);
				tableIdentifier();
				setState(947);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(948);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(950);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(951);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(952);
				tableIdentifier();
				setState(953);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(954);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(956);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(957);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(958);
				tableIdentifier();
				setState(959);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(960);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(962);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(963);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(964);
				tableIdentifier();
				setState(965);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(967);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(968);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(969);
				tableIdentifier();
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(970);
					partitionSpec();
					}
				}

				setState(973);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(975);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(976);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(977);
				tableIdentifier();
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(978);
					partitionSpec();
					}
				}

				setState(981);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(983);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(984);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(985);
				tableIdentifier();
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(986);
					partitionSpec();
					}
				}

				setState(989);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(990);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(992);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(993);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(994);
				tableIdentifier();
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(995);
					partitionSpec();
					}
				}

				setState(998);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(999);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1001);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1002);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1003);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1004);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1005);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1006);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(1007);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(CREATE);
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1011);
				match(TEMPORARY);
				}
			}

			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1014);
				match(EXTERNAL);
				}
			}

			setState(1017);
			match(TABLE);
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1018);
				match(IF);
				setState(1019);
				match(NOT);
				setState(1020);
				match(EXISTS);
				}
				break;
			}
			setState(1023);
			tableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(CLUSTERED);
			setState(1026);
			match(BY);
			setState(1027);
			identifierList();
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1028);
				match(SORTED);
				setState(1029);
				match(BY);
				setState(1030);
				orderedIdentifierList();
				}
			}

			setState(1033);
			match(INTO);
			setState(1034);
			match(INTEGER_VALUE);
			setState(1035);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(SKEWED);
			setState(1038);
			match(BY);
			setState(1039);
			identifierList();
			setState(1040);
			match(ON);
			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1041);
				constantList();
				}
				break;
			case 2:
				{
				setState(1042);
				nestedConstantList();
				}
				break;
			}
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1045);
				match(STORED);
				setState(1046);
				match(AS);
				setState(1047);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(LOCATION);
			setState(1051);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1053);
				ctes();
				}
			}

			setState(1056);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_insertInto);
		int _la;
		try {
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				match(INSERT);
				setState(1059);
				match(OVERWRITE);
				setState(1060);
				match(TABLE);
				setState(1061);
				tableIdentifier();
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1062);
					partitionSpec();
					setState(1066);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1063);
						match(IF);
						setState(1064);
						match(NOT);
						setState(1065);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(INSERT);
				setState(1071);
				match(INTO);
				setState(1073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1072);
					match(TABLE);
					}
					break;
				}
				setState(1075);
				tableIdentifier();
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1076);
					partitionSpec();
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				match(INSERT);
				setState(1080);
				match(OVERWRITE);
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1081);
					match(LOCAL);
					}
				}

				setState(1084);
				match(DIRECTORY);
				setState(1085);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1086);
					rowFormat();
					}
				}

				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1089);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1092);
				match(INSERT);
				setState(1093);
				match(OVERWRITE);
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1094);
					match(LOCAL);
					}
				}

				setState(1097);
				match(DIRECTORY);
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1098);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1101);
				tableProvider();
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1102);
					match(OPTIONS);
					setState(1103);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			partitionSpec();
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1109);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			match(PARTITION);
			setState(1113);
			match(T__0);
			setState(1114);
			partitionVal();
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1115);
				match(T__2);
				setState(1116);
				partitionVal();
				}
				}
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1122);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			identifier();
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1125);
				match(EQ);
				setState(1126);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_describeFuncName);
		try {
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1131);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1132);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1133);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1137);
				match(T__3);
				setState(1138);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(WITH);
			setState(1145);
			namedQuery();
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1146);
				match(T__2);
				setState(1147);
				namedQuery();
				}
				}
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1154);
				match(AS);
				}
			}

			setState(1157);
			match(T__0);
			setState(1158);
			query();
			setState(1159);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(USING);
			setState(1162);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			match(T__0);
			setState(1165);
			tableProperty();
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1166);
				match(T__2);
				setState(1167);
				tableProperty();
				}
				}
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1173);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 238)) & ~0x3f) == 0 && ((1L << (_la - 238)) & 97L) != 0)) {
				{
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1176);
					match(EQ);
					}
				}

				setState(1179);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				identifier();
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1183);
					match(T__3);
					setState(1184);
					identifier();
					}
					}
					setState(1189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tablePropertyValue);
		try {
			setState(1197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1193);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1194);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1195);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1196);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(T__0);
			setState(1200);
			constant();
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1201);
				match(T__2);
				setState(1202);
				constant();
				}
				}
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1208);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(T__0);
			setState(1211);
			constantList();
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1212);
				match(T__2);
				setState(1213);
				constantList();
				}
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1219);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createFileFormat);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1221);
				match(STORED);
				setState(1222);
				match(AS);
				setState(1223);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
				match(STORED);
				setState(1225);
				match(BY);
				setState(1226);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fileFormat);
		try {
			setState(1234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				match(INPUTFORMAT);
				setState(1230);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1231);
				match(OUTPUTFORMAT);
				setState(1232);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1233);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(STRING);
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1237);
				match(WITH);
				setState(1238);
				match(SERDEPROPERTIES);
				setState(1239);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			identifier();
			setState(1243);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_queryNoWith);
		int _la;
		try {
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1245);
					insertInto();
					}
				}

				setState(1248);
				queryTerm(0);
				setState(1249);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1251);
				fromClause();
				setState(1253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1252);
					multiInsertQueryBody();
					}
					}
					setState(1255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1259);
				match(ORDER);
				setState(1260);
				match(BY);
				setState(1261);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1262);
					match(T__2);
					setState(1263);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1271);
				match(CLUSTER);
				setState(1272);
				match(BY);
				setState(1273);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1274);
					match(T__2);
					setState(1275);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1283);
				match(DISTRIBUTE);
				setState(1284);
				match(BY);
				setState(1285);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1286);
					match(T__2);
					setState(1287);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1295);
				match(SORT);
				setState(1296);
				match(BY);
				setState(1297);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1298);
					match(T__2);
					setState(1299);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1307);
				windows();
				}
			}

			setState(1315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1310);
				match(LIMIT);
				setState(1313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1311);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1312);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1317);
				insertInto();
				}
			}

			setState(1320);
			querySpecification();
			setState(1321);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1324);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(1326);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1327);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 15L) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(1328);
						setQuantifier();
						}
					}

					setState(1331);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(1336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_queryPrimary);
		try {
			setState(1345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
				match(TABLE);
				setState(1339);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1340);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1341);
				match(T__0);
				setState(1342);
				queryNoWith();
				setState(1343);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			expression();
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1348);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1351);
				match(NULLS);
				setState(1352);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuerySpecificationContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1365);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1355);
					match(SELECT);
					setState(1356);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1357);
					match(T__0);
					setState(1358);
					namedExpressionSeq();
					setState(1359);
					match(T__1);
					}
					break;
				case MAP:
					{
					setState(1361);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1362);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1363);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1364);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1367);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1370);
					match(RECORDWRITER);
					setState(1371);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1374);
				match(USING);
				setState(1375);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1376);
					match(AS);
					setState(1386);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						setState(1377);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1378);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(1379);
						match(T__0);
						setState(1382);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(1380);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(1381);
							colTypeList();
							}
							break;
						}
						setState(1384);
						match(T__1);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1390);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1393);
					match(RECORDREADER);
					setState(1394);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1397);
					fromClause();
					}
					break;
				}
				setState(1402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1400);
					match(WHERE);
					setState(1401);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1426);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1404);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(1405);
						((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						}
						}
						setState(1410);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1412);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(1411);
						setQuantifier();
						}
						break;
					}
					setState(1414);
					namedExpressionSeq();
					setState(1416);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						setState(1415);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1418);
					fromClause();
					setState(1424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						setState(1419);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1421);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
						case 1:
							{
							setState(1420);
							setQuantifier();
							}
							break;
						}
						setState(1423);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1428);
						lateralView();
						}
						} 
					}
					setState(1433);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				setState(1436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1434);
					match(WHERE);
					setState(1435);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1438);
					aggregation();
					}
					break;
				}
				setState(1443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1441);
					match(HAVING);
					setState(1442);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1445);
					windows();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(T__4);
			setState(1451);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1016L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & -65599L) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & 52810917871615L) != 0)) {
				{
				{
				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1452);
					match(T__2);
					}
				}

				setState(1455);
				((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				}
				}
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1461);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_hintStatement);
		int _la;
		try {
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1464);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1465);
				match(T__0);
				setState(1466);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1467);
					match(T__2);
					setState(1468);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1474);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(FROM);
			setState(1479);
			relation();
			setState(1484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1480);
					match(T__2);
					setState(1481);
					relation();
					}
					} 
				}
				setState(1486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1487);
					lateralView();
					}
					} 
				}
				setState(1492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_aggregation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(GROUP);
			setState(1494);
			match(BY);
			setState(1495);
			((AggregationContext)_localctx).expression = expression();
			((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
			setState(1500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1496);
					match(T__2);
					setState(1497);
					((AggregationContext)_localctx).expression = expression();
					((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
					}
					} 
				}
				setState(1502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1503);
				match(WITH);
				setState(1504);
				((AggregationContext)_localctx).kind = match(ROLLUP);
				}
				break;
			case 2:
				{
				setState(1505);
				match(WITH);
				setState(1506);
				((AggregationContext)_localctx).kind = match(CUBE);
				}
				break;
			case 3:
				{
				setState(1507);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1508);
				match(SETS);
				setState(1509);
				match(T__0);
				setState(1510);
				groupingSet();
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1511);
					match(T__2);
					setState(1512);
					groupingSet();
					}
					}
					setState(1517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1518);
				match(T__1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_groupingSet);
		int _la;
		try {
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				match(T__0);
				setState(1531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1022L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & -2099097L) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & 2234207627640831L) != 0)) {
					{
					setState(1523);
					expression();
					setState(1528);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1524);
						match(T__2);
						setState(1525);
						expression();
						}
						}
						setState(1530);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1533);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			match(LATERAL);
			setState(1538);
			match(VIEW);
			setState(1540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1539);
				match(OUTER);
				}
				break;
			}
			setState(1542);
			qualifiedName();
			setState(1543);
			match(T__0);
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1022L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & -2099097L) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & 2234207627640831L) != 0)) {
				{
				setState(1544);
				expression();
				setState(1549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1545);
					match(T__2);
					setState(1546);
					expression();
					}
					}
					setState(1551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1554);
			match(T__1);
			setState(1555);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1556);
					match(AS);
					}
					break;
				}
				setState(1559);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1560);
						match(T__2);
						setState(1561);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			relationPrimary();
			setState(1575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1572);
					joinRelation();
					}
					} 
				}
				setState(1577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_joinRelation);
		try {
			setState(1589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1578);
				joinType();
				}
				setState(1579);
				match(JOIN);
				setState(1580);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1581);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1584);
				match(NATURAL);
				setState(1585);
				joinType();
				setState(1586);
				match(JOIN);
				setState(1587);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_joinType);
		int _la;
		try {
			setState(1613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1591);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1594);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1595);
				match(LEFT);
				setState(1597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1596);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1599);
				match(LEFT);
				setState(1600);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1601);
				match(RIGHT);
				setState(1603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1602);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1605);
				match(FULL);
				setState(1607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1606);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1609);
					match(LEFT);
					}
				}

				setState(1612);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_joinCriteria);
		int _la;
		try {
			setState(1629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1615);
				match(ON);
				setState(1616);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1617);
				match(USING);
				setState(1618);
				match(T__0);
				setState(1619);
				identifier();
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1620);
					match(T__2);
					setState(1621);
					identifier();
					}
					}
					setState(1626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1627);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SampleContext extends ParserRuleContext {
		public Token negativeSign;
		public Token percentage;
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode BYTELENGTH_LITERAL() { return getToken(SqlBaseParser.BYTELENGTH_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(TABLESAMPLE);
			setState(1632);
			match(T__0);
			setState(1657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				{
				setState(1634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1633);
					((SampleContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1636);
				((SampleContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1637);
				((SampleContext)_localctx).sampleType = match(PERCENTLIT);
				}
				}
				break;
			case 2:
				{
				{
				setState(1638);
				expression();
				setState(1639);
				((SampleContext)_localctx).sampleType = match(ROWS);
				}
				}
				break;
			case 3:
				{
				setState(1641);
				((SampleContext)_localctx).sampleType = match(BYTELENGTH_LITERAL);
				}
				break;
			case 4:
				{
				{
				setState(1642);
				((SampleContext)_localctx).sampleType = match(BUCKET);
				setState(1643);
				((SampleContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1644);
				match(OUT);
				setState(1645);
				match(OF);
				setState(1646);
				((SampleContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1647);
					match(ON);
					setState(1653);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
					case 1:
						{
						setState(1648);
						identifier();
						}
						break;
					case 2:
						{
						setState(1649);
						qualifiedName();
						setState(1650);
						match(T__0);
						setState(1651);
						match(T__1);
						}
						break;
					}
					}
				}

				}
				}
				break;
			}
			setState(1659);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			match(T__0);
			setState(1662);
			identifierSeq();
			setState(1663);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			identifier();
			setState(1670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1666);
					match(T__2);
					setState(1667);
					identifier();
					}
					} 
				}
				setState(1672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			match(T__0);
			setState(1674);
			orderedIdentifier();
			setState(1679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1675);
				match(T__2);
				setState(1676);
				orderedIdentifier();
				}
				}
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1682);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			identifier();
			setState(1686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1685);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			match(T__0);
			setState(1689);
			identifierComment();
			setState(1694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1690);
				match(T__2);
				setState(1691);
				identifierComment();
				}
				}
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1697);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
			identifier();
			setState(1702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1700);
				match(COMMENT);
				setState(1701);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_relationPrimary);
		try {
			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1704);
				tableIdentifier();
				setState(1706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1705);
					sample();
					}
					break;
				}
				setState(1708);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1710);
				match(T__0);
				setState(1711);
				queryNoWith();
				setState(1712);
				match(T__1);
				setState(1714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1713);
					sample();
					}
					break;
				}
				setState(1716);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1718);
				match(T__0);
				setState(1719);
				relation();
				setState(1720);
				match(T__1);
				setState(1722);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1721);
					sample();
					}
					break;
				}
				setState(1724);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1726);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1727);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			match(VALUES);
			setState(1731);
			expression();
			setState(1736);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1732);
					match(T__2);
					setState(1733);
					expression();
					}
					} 
				}
				setState(1738);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			setState(1739);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			identifier();
			setState(1742);
			match(T__0);
			setState(1751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1022L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & -2099097L) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & 2234207627640831L) != 0)) {
				{
				setState(1743);
				expression();
				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1744);
					match(T__2);
					setState(1745);
					expression();
					}
					}
					setState(1750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1753);
			match(T__1);
			setState(1754);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1757);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1756);
					match(AS);
					}
					break;
				}
				setState(1759);
				strictIdentifier();
				setState(1761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1760);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_rowFormat);
		try {
			setState(1814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1765);
				match(ROW);
				setState(1766);
				match(FORMAT);
				setState(1767);
				match(SERDE);
				setState(1768);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1772);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1769);
					match(WITH);
					setState(1770);
					match(SERDEPROPERTIES);
					setState(1771);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
				match(ROW);
				setState(1775);
				match(FORMAT);
				setState(1776);
				match(DELIMITED);
				setState(1786);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1777);
					match(FIELDS);
					setState(1778);
					match(TERMINATED);
					setState(1779);
					match(BY);
					setState(1780);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1784);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
					case 1:
						{
						setState(1781);
						match(ESCAPED);
						setState(1782);
						match(BY);
						setState(1783);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1788);
					match(COLLECTION);
					setState(1789);
					match(ITEMS);
					setState(1790);
					match(TERMINATED);
					setState(1791);
					match(BY);
					setState(1792);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1795);
					match(MAP);
					setState(1796);
					match(KEYS);
					setState(1797);
					match(TERMINATED);
					setState(1798);
					match(BY);
					setState(1799);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1806);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1802);
					match(LINES);
					setState(1803);
					match(TERMINATED);
					setState(1804);
					match(BY);
					setState(1805);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1812);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1808);
					match(NULL);
					setState(1809);
					match(DEFINED);
					setState(1810);
					match(AS);
					setState(1811);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(1816);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1817);
				match(T__3);
				}
				break;
			}
			setState(1821);
			((TableIdentifierContext)_localctx).table = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext function;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(1823);
				((FunctionIdentifierContext)_localctx).db = identifier();
				setState(1824);
				match(T__3);
				}
				break;
			}
			setState(1828);
			((FunctionIdentifierContext)_localctx).function = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			expression();
			setState(1838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1832);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1831);
					match(AS);
					}
					break;
				}
				setState(1836);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case DIRECTORY:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case BOTH:
				case LEADING:
				case TRAILING:
				case IF:
				case POSITION:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case CURRENT_DATE:
				case CURRENT_TIMESTAMP:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1834);
					identifier();
					}
					break;
				case T__0:
					{
					setState(1835);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			namedExpression();
			setState(1845);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1841);
					match(T__2);
					setState(1842);
					namedExpression();
					}
					} 
				}
				setState(1847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1851);
				match(NOT);
				setState(1852);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1853);
				match(EXISTS);
				setState(1854);
				match(T__0);
				setState(1855);
				query();
				setState(1856);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1858);
				predicated();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1869);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1867);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1861);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1862);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1863);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1864);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1865);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1866);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			valueExpression(0);
			setState(1874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(1873);
				predicate();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_predicate);
		int _la;
		try {
			setState(1924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1876);
					match(NOT);
					}
				}

				setState(1879);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1880);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1881);
				match(AND);
				setState(1882);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1884);
					match(NOT);
					}
				}

				setState(1887);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1888);
				match(T__0);
				setState(1889);
				expression();
				setState(1894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1890);
					match(T__2);
					setState(1891);
					expression();
					}
					}
					setState(1896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1897);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1899);
					match(NOT);
					}
				}

				setState(1902);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1903);
				match(T__0);
				setState(1904);
				query();
				setState(1905);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1907);
					match(NOT);
					}
				}

				setState(1910);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1911);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1912);
				match(IS);
				setState(1914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1913);
					match(NOT);
					}
				}

				setState(1916);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1917);
				match(IS);
				setState(1919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1918);
					match(NOT);
					}
				}

				setState(1921);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(1922);
				match(FROM);
				setState(1923);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1927);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1928);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 67L) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1929);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1951);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1932);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1933);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 15L) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1934);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1935);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1936);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 515L) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1937);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1938);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1939);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(1940);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1941);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1942);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(1943);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1944);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1945);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(1946);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1947);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1948);
						comparisonOperator();
						setState(1949);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(1955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimeFunctionCallContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TimeFunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public Token trimOption;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				_localctx = new TimeFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1957);
				((TimeFunctionCallContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((TimeFunctionCallContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1958);
				match(CASE);
				setState(1960); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1959);
					whenClause();
					}
					}
					setState(1962); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1964);
					match(ELSE);
					setState(1965);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1968);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1970);
				match(CASE);
				setState(1971);
				((SimpleCaseContext)_localctx).value = expression();
				setState(1973); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1972);
					whenClause();
					}
					}
					setState(1975); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1977);
					match(ELSE);
					setState(1978);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1981);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1983);
				match(CAST);
				setState(1984);
				match(T__0);
				setState(1985);
				expression();
				setState(1986);
				match(AS);
				setState(1987);
				dataType();
				setState(1988);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1990);
				match(STRUCT);
				setState(1991);
				match(T__0);
				setState(2000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1022L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & -2099097L) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & 2234207627640831L) != 0)) {
					{
					setState(1992);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(1997);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1993);
						match(T__2);
						setState(1994);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(1999);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2002);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2003);
				match(FIRST);
				setState(2004);
				match(T__0);
				setState(2005);
				expression();
				setState(2008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2006);
					match(IGNORE);
					setState(2007);
					match(NULLS);
					}
				}

				setState(2010);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2012);
				match(LAST);
				setState(2013);
				match(T__0);
				setState(2014);
				expression();
				setState(2017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2015);
					match(IGNORE);
					setState(2016);
					match(NULLS);
					}
				}

				setState(2019);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2021);
				match(POSITION);
				setState(2022);
				match(T__0);
				setState(2023);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2024);
				match(IN);
				setState(2025);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2026);
				match(T__1);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2028);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2029);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2030);
				qualifiedName();
				setState(2031);
				match(T__3);
				setState(2032);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2034);
				match(T__0);
				setState(2035);
				namedExpression();
				setState(2038); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2036);
					match(T__2);
					setState(2037);
					namedExpression();
					}
					}
					setState(2040); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2042);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2044);
				match(T__0);
				setState(2045);
				query();
				setState(2046);
				match(T__1);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2048);
				qualifiedName();
				setState(2049);
				match(T__0);
				setState(2061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1022L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & -2099097L) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & 2234207627640831L) != 0)) {
					{
					setState(2051);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
					case 1:
						{
						setState(2050);
						setQuantifier();
						}
						break;
					}
					setState(2053);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2058);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2054);
						match(T__2);
						setState(2055);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2060);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2063);
				match(T__1);
				setState(2066);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2064);
					match(OVER);
					setState(2065);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2068);
				qualifiedName();
				setState(2069);
				match(T__0);
				setState(2070);
				((FunctionCallContext)_localctx).trimOption = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 7L) != 0)) ) {
					((FunctionCallContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2071);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2072);
				match(FROM);
				setState(2073);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2074);
				match(T__1);
				}
				break;
			case 16:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2076);
				identifier();
				}
				break;
			case 17:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2077);
				match(T__0);
				setState(2078);
				expression();
				setState(2079);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2093);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2091);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2083);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2084);
						match(T__6);
						setState(2085);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2086);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2088);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2089);
						match(T__3);
						setState(2090);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2095);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_constant);
		try {
			int _alt;
			setState(2108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2096);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2097);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2098);
				identifier();
				setState(2099);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2101);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2102);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2104); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2103);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2106); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2112);
			_la = _input.LA(1);
			if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 2047L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013265920L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2118);
			match(INTERVAL);
			setState(2122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2119);
					intervalField();
					}
					} 
				}
				setState(2124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2125);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(2126);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(2129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2127);
				match(TO);
				setState(2128);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_intervalValue);
		int _la;
		try {
			setState(2136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2131);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2134);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2135);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_colPosition);
		try {
			setState(2141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2138);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2139);
				match(AFTER);
				setState(2140);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_dataType);
		int _la;
		try {
			setState(2177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2143);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2144);
				match(LT);
				setState(2145);
				dataType();
				setState(2146);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2148);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2149);
				match(LT);
				setState(2150);
				dataType();
				setState(2151);
				match(T__2);
				setState(2152);
				dataType();
				setState(2153);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2155);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2162);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2156);
					match(LT);
					setState(2158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1024L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & -65599L) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & 52810917871615L) != 0)) {
						{
						setState(2157);
						complexColTypeList();
						}
					}

					setState(2160);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2161);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2164);
				identifier();
				setState(2175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2165);
					match(T__0);
					setState(2166);
					match(INTEGER_VALUE);
					setState(2171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2167);
						match(T__2);
						setState(2168);
						match(INTEGER_VALUE);
						}
						}
						setState(2173);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2174);
					match(T__1);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2179);
			colType();
			setState(2184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2180);
					match(T__2);
					setState(2181);
					colType();
					}
					} 
				}
				setState(2186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2187);
			identifier();
			setState(2188);
			dataType();
			setState(2191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(2189);
				match(COMMENT);
				setState(2190);
				match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			complexColType();
			setState(2198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2194);
				match(T__2);
				setState(2195);
				complexColType();
				}
				}
				setState(2200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			identifier();
			setState(2202);
			match(T__8);
			setState(2203);
			dataType();
			setState(2206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2204);
				match(COMMENT);
				setState(2205);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			match(WHEN);
			setState(2209);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2210);
			match(THEN);
			setState(2211);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			match(WINDOW);
			setState(2214);
			namedWindow();
			setState(2219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2215);
					match(T__2);
					setState(2216);
					namedWindow();
					}
					} 
				}
				setState(2221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2222);
			identifier();
			setState(2223);
			match(AS);
			setState(2224);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_windowSpec);
		int _la;
		try {
			setState(2268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2226);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case T__0:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2227);
				match(T__0);
				setState(2262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2228);
					match(CLUSTER);
					setState(2229);
					match(BY);
					setState(2230);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2231);
						match(T__2);
						setState(2232);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2237);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__1:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(2248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2238);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2239);
						match(BY);
						setState(2240);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2245);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2241);
							match(T__2);
							setState(2242);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2247);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2260);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2250);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2251);
						match(BY);
						setState(2252);
						sortItem();
						setState(2257);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2253);
							match(T__2);
							setState(2254);
							sortItem();
							}
							}
							setState(2259);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2264);
					windowFrame();
					}
				}

				setState(2267);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_windowFrame);
		try {
			setState(2286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2270);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2271);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2272);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2273);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2274);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2275);
				match(BETWEEN);
				setState(2276);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2277);
				match(AND);
				setState(2278);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2280);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2281);
				match(BETWEEN);
				setState(2282);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2283);
				match(AND);
				setState(2284);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_frameBound);
		int _la;
		try {
			setState(2295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2288);
				match(UNBOUNDED);
				setState(2289);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2290);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2291);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2292);
				expression();
				setState(2293);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2297);
			identifier();
			setState(2302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2298);
					match(T__3);
					setState(2299);
					identifier();
					}
					} 
				}
				setState(2304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_identifier);
		try {
			setState(2320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2305);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2306);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2307);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2308);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2309);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(2310);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2311);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2312);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2313);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(2314);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2315);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(2316);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(2317);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(2318);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(2319);
				match(SETMINUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_strictIdentifier);
		try {
			setState(2325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2322);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2323);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2324);
				nonReserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_number);
		int _la;
		try {
			setState(2357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2329);
					match(MINUS);
					}
				}

				setState(2332);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2333);
					match(MINUS);
					}
				}

				setState(2336);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2337);
					match(MINUS);
					}
				}

				setState(2340);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2341);
					match(MINUS);
					}
				}

				setState(2344);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2345);
					match(MINUS);
					}
				}

				setState(2348);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2349);
					match(MINUS);
					}
				}

				setState(2352);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2353);
					match(MINUS);
					}
				}

				setState(2356);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -1147292005072634880L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611685503031312383L) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & -65599L) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & 33285996543L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 67:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 70:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 71:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u00fe\u093a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00df\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00e4"+
		"\b\u0006\u0001\u0006\u0003\u0006\u00e7\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00ec\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00f9\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00fd\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0104\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0109\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u010e\b\u0006\u0001\u0006\u0003\u0006\u0111\b\u0006\u0001\u0006\u0003"+
		"\u0006\u0114\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0118\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u011c\b\u0006\u0001\u0006\u0003\u0006"+
		"\u011f\b\u0006\u0001\u0006\u0003\u0006\u0122\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0129\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u012d\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0135\b\u0006\u0001"+
		"\u0006\u0003\u0006\u0138\b\u0006\u0001\u0006\u0003\u0006\u013b\b\u0006"+
		"\u0001\u0006\u0003\u0006\u013e\b\u0006\u0001\u0006\u0003\u0006\u0141\b"+
		"\u0006\u0001\u0006\u0003\u0006\u0144\b\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0148\b\u0006\u0001\u0006\u0003\u0006\u014b\b\u0006\u0001\u0006"+
		"\u0003\u0006\u014e\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0155\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u015b\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0161\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0169\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0189\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0191\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0195\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u019a\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u01a0"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u01a8\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u01ae\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u01bb\b\u0006\u0001\u0006\u0004\u0006\u01be"+
		"\b\u0006\u000b\u0006\f\u0006\u01bf\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u01c9\b\u0006"+
		"\u0001\u0006\u0004\u0006\u01cc\b\u0006\u000b\u0006\f\u0006\u01cd\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u01de\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u01e3\b\u0006\n\u0006\f\u0006\u01e6\t\u0006\u0001\u0006"+
		"\u0003\u0006\u01e9\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u01f1\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u01f6\b\u0006\n\u0006\f\u0006\u01f9\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u01ff\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u020e\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0212"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0218"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u021e"+
		"\b\u0006\u0001\u0006\u0003\u0006\u0221\b\u0006\u0001\u0006\u0003\u0006"+
		"\u0224\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u022a\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u022e\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0232\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0237\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u023b"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0243\b\u0006\u0001\u0006\u0003\u0006\u0246\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u024f\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0254\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u025a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0261\b\u0006\u0001\u0006\u0003\u0006\u0264\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u026a"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0273\b\u0006\n\u0006\f\u0006\u0276\t\u0006"+
		"\u0003\u0006\u0278\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u027c\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0281\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0286\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u028d\b\u0006\u0001"+
		"\u0006\u0003\u0006\u0290\b\u0006\u0001\u0006\u0003\u0006\u0293\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u029a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u029f\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02a5"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u02ae\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02b6\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02bc\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u02c0\b\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u02c4\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02c8\b\u0006"+
		"\u0003\u0006\u02ca\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02d3\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02d9\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u02de\b\u0006\u0001\u0006\u0003\u0006"+
		"\u02e1\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02e5\b\u0006\u0001"+
		"\u0006\u0003\u0006\u02e8\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u02f0\b\u0006\n\u0006\f\u0006"+
		"\u02f3\t\u0006\u0003\u0006\u02f5\b\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u02f9\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02fe"+
		"\b\u0006\u0001\u0006\u0003\u0006\u0301\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0307\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u030f\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0314\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u031a\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0320\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0329\b\u0006\n\u0006\f\u0006\u032c\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0331\b\u0006\n\u0006\f\u0006\u0334\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0338\b\u0006\n\u0006\f\u0006\u033b"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0340\b\u0006"+
		"\n\u0006\f\u0006\u0343\t\u0006\u0003\u0006\u0345\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u034d"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0351\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0358\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u03cc\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u03d4\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03dc\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u03e5\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u03f1\b\u0007\u0001\b\u0001\b\u0003\b\u03f5\b"+
		"\b\u0001\b\u0003\b\u03f8\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u03fe"+
		"\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0408\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0414\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u0419"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0003\f\u041f\b\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u042b\b\r\u0003\r\u042d\b\r\u0001\r\u0001\r\u0001\r\u0003\r"+
		"\u0432\b\r\u0001\r\u0001\r\u0003\r\u0436\b\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u043b\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0440\b\r\u0001\r\u0003\r"+
		"\u0443\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0448\b\r\u0001\r\u0001\r\u0003"+
		"\r\u044c\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0451\b\r\u0003\r\u0453\b"+
		"\r\u0001\u000e\u0001\u000e\u0003\u000e\u0457\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u045e\b\u000f\n"+
		"\u000f\f\u000f\u0461\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0468\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u046f\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0474\b\u0012\n\u0012\f\u0012\u0477\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u047d\b\u0013"+
		"\n\u0013\f\u0013\u0480\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0484"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0491\b\u0016\n\u0016\f\u0016\u0494\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u049a\b\u0017\u0001\u0017\u0003\u0017"+
		"\u049d\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u04a2\b"+
		"\u0018\n\u0018\f\u0018\u04a5\t\u0018\u0001\u0018\u0003\u0018\u04a8\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u04ae\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u04b4\b\u001a"+
		"\n\u001a\f\u001a\u04b7\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u04bf\b\u001b\n\u001b\f\u001b"+
		"\u04c2\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u04cc\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u04d3\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u04d9\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0003 \u04df\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0004 \u04e6\b \u000b \f \u04e7\u0003 \u04ea\b"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u04f1\b!\n!\f!\u04f4\t!\u0003"+
		"!\u04f6\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u04fd\b!\n!\f!\u0500"+
		"\t!\u0003!\u0502\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0509\b"+
		"!\n!\f!\u050c\t!\u0003!\u050e\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u0515\b!\n!\f!\u0518\t!\u0003!\u051a\b!\u0001!\u0003!\u051d\b!\u0001"+
		"!\u0001!\u0001!\u0003!\u0522\b!\u0003!\u0524\b!\u0001\"\u0003\"\u0527"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u0532\b#\u0001#\u0005#\u0535\b#\n#\f#\u0538\t#\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0542\b$\u0001%\u0001"+
		"%\u0003%\u0546\b%\u0001%\u0001%\u0003%\u054a\b%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0556\b&\u0001&\u0003"+
		"&\u0559\b&\u0001&\u0001&\u0003&\u055d\b&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0567\b&\u0001&\u0001&\u0003&\u056b\b&\u0003"+
		"&\u056d\b&\u0001&\u0003&\u0570\b&\u0001&\u0001&\u0003&\u0574\b&\u0001"+
		"&\u0003&\u0577\b&\u0001&\u0001&\u0003&\u057b\b&\u0001&\u0001&\u0005&\u057f"+
		"\b&\n&\f&\u0582\t&\u0001&\u0003&\u0585\b&\u0001&\u0001&\u0003&\u0589\b"+
		"&\u0001&\u0001&\u0001&\u0003&\u058e\b&\u0001&\u0003&\u0591\b&\u0003&\u0593"+
		"\b&\u0001&\u0005&\u0596\b&\n&\f&\u0599\t&\u0001&\u0001&\u0003&\u059d\b"+
		"&\u0001&\u0003&\u05a0\b&\u0001&\u0001&\u0003&\u05a4\b&\u0001&\u0003&\u05a7"+
		"\b&\u0003&\u05a9\b&\u0001\'\u0001\'\u0001\'\u0003\'\u05ae\b\'\u0001\'"+
		"\u0005\'\u05b1\b\'\n\'\f\'\u05b4\t\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0005(\u05be\b(\n(\f(\u05c1\t(\u0001(\u0001(\u0003"+
		"(\u05c5\b(\u0001)\u0001)\u0001)\u0001)\u0005)\u05cb\b)\n)\f)\u05ce\t)"+
		"\u0001)\u0005)\u05d1\b)\n)\f)\u05d4\t)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0005*\u05db\b*\n*\f*\u05de\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0005*\u05ea\b*\n*\f*\u05ed\t*\u0001*\u0001"+
		"*\u0003*\u05f1\b*\u0001+\u0001+\u0001+\u0001+\u0005+\u05f7\b+\n+\f+\u05fa"+
		"\t+\u0003+\u05fc\b+\u0001+\u0001+\u0003+\u0600\b+\u0001,\u0001,\u0001"+
		",\u0003,\u0605\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u060c\b,\n"+
		",\f,\u060f\t,\u0003,\u0611\b,\u0001,\u0001,\u0001,\u0003,\u0616\b,\u0001"+
		",\u0001,\u0001,\u0005,\u061b\b,\n,\f,\u061e\t,\u0003,\u0620\b,\u0001-"+
		"\u0001-\u0001.\u0001.\u0005.\u0626\b.\n.\f.\u0629\t.\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u062f\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0636"+
		"\b/\u00010\u00030\u0639\b0\u00010\u00010\u00010\u00030\u063e\b0\u0001"+
		"0\u00010\u00010\u00010\u00030\u0644\b0\u00010\u00010\u00030\u0648\b0\u0001"+
		"0\u00030\u064b\b0\u00010\u00030\u064e\b0\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00051\u0657\b1\n1\f1\u065a\t1\u00011\u00011\u00031\u065e"+
		"\b1\u00012\u00012\u00012\u00032\u0663\b2\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00032\u0676\b2\u00032\u0678\b2\u00032\u067a\b2\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00054\u0685"+
		"\b4\n4\f4\u0688\t4\u00015\u00015\u00015\u00015\u00055\u068e\b5\n5\f5\u0691"+
		"\t5\u00015\u00015\u00016\u00016\u00036\u0697\b6\u00017\u00017\u00017\u0001"+
		"7\u00057\u069d\b7\n7\f7\u06a0\t7\u00017\u00017\u00018\u00018\u00018\u0003"+
		"8\u06a7\b8\u00019\u00019\u00039\u06ab\b9\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00039\u06b3\b9\u00019\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u06bb\b9\u00019\u00019\u00019\u00019\u00039\u06c1\b9\u0001:\u0001:\u0001"+
		":\u0001:\u0005:\u06c7\b:\n:\f:\u06ca\t:\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0005;\u06d3\b;\n;\f;\u06d6\t;\u0003;\u06d8\b;\u0001;"+
		"\u0001;\u0001;\u0001<\u0003<\u06de\b<\u0001<\u0001<\u0003<\u06e2\b<\u0003"+
		"<\u06e4\b<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u06ed"+
		"\b=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0003=\u06f9\b=\u0003=\u06fb\b=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003"+
		"=\u0702\b=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u0709\b=\u0001=\u0001"+
		"=\u0001=\u0001=\u0003=\u070f\b=\u0001=\u0001=\u0001=\u0001=\u0003=\u0715"+
		"\b=\u0003=\u0717\b=\u0001>\u0001>\u0001>\u0003>\u071c\b>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0003?\u0723\b?\u0001?\u0001?\u0001@\u0001@\u0003"+
		"@\u0729\b@\u0001@\u0001@\u0003@\u072d\b@\u0003@\u072f\b@\u0001A\u0001"+
		"A\u0001A\u0005A\u0734\bA\nA\fA\u0737\tA\u0001B\u0001B\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u0744\bC\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0005C\u074c\bC\nC\fC\u074f\tC\u0001D\u0001"+
		"D\u0003D\u0753\bD\u0001E\u0003E\u0756\bE\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0003E\u075e\bE\u0001E\u0001E\u0001E\u0001E\u0001E\u0005E\u0765"+
		"\bE\nE\fE\u0768\tE\u0001E\u0001E\u0001E\u0003E\u076d\bE\u0001E\u0001E"+
		"\u0001E\u0001E\u0001E\u0001E\u0003E\u0775\bE\u0001E\u0001E\u0001E\u0001"+
		"E\u0003E\u077b\bE\u0001E\u0001E\u0001E\u0003E\u0780\bE\u0001E\u0001E\u0001"+
		"E\u0003E\u0785\bE\u0001F\u0001F\u0001F\u0001F\u0003F\u078b\bF\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0005F\u07a0\bF\nF"+
		"\fF\u07a3\tF\u0001G\u0001G\u0001G\u0001G\u0004G\u07a9\bG\u000bG\fG\u07aa"+
		"\u0001G\u0001G\u0003G\u07af\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0004"+
		"G\u07b6\bG\u000bG\fG\u07b7\u0001G\u0001G\u0003G\u07bc\bG\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0005G\u07cc\bG\nG\fG\u07cf\tG\u0003G\u07d1\bG\u0001G"+
		"\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u07d9\bG\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0003G\u07e2\bG\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0004G\u07f7\bG\u000bG\fG\u07f8\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0804"+
		"\bG\u0001G\u0001G\u0001G\u0005G\u0809\bG\nG\fG\u080c\tG\u0003G\u080e\b"+
		"G\u0001G\u0001G\u0001G\u0003G\u0813\bG\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0822"+
		"\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0005G\u082c"+
		"\bG\nG\fG\u082f\tG\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0004H\u0839\bH\u000bH\fH\u083a\u0003H\u083d\bH\u0001I\u0001I\u0001"+
		"J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001M\u0001M\u0005M\u0849\bM\nM"+
		"\fM\u084c\tM\u0001N\u0001N\u0001N\u0001N\u0003N\u0852\bN\u0001O\u0003"+
		"O\u0855\bO\u0001O\u0001O\u0003O\u0859\bO\u0001P\u0001P\u0001P\u0003P\u085e"+
		"\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u086f\bQ\u0001Q\u0001Q\u0003"+
		"Q\u0873\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0005Q\u087a\bQ\nQ\fQ\u087d"+
		"\tQ\u0001Q\u0003Q\u0880\bQ\u0003Q\u0882\bQ\u0001R\u0001R\u0001R\u0005"+
		"R\u0887\bR\nR\fR\u088a\tR\u0001S\u0001S\u0001S\u0001S\u0003S\u0890\bS"+
		"\u0001T\u0001T\u0001T\u0005T\u0895\bT\nT\fT\u0898\tT\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0003U\u089f\bU\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"W\u0001W\u0001W\u0001W\u0005W\u08aa\bW\nW\fW\u08ad\tW\u0001X\u0001X\u0001"+
		"X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u08ba"+
		"\bY\nY\fY\u08bd\tY\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u08c4\bY"+
		"\nY\fY\u08c7\tY\u0003Y\u08c9\bY\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0005"+
		"Y\u08d0\bY\nY\fY\u08d3\tY\u0003Y\u08d5\bY\u0003Y\u08d7\bY\u0001Y\u0003"+
		"Y\u08da\bY\u0001Y\u0003Y\u08dd\bY\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0003Z\u08ef\bZ\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0003"+
		"[\u08f8\b[\u0001\\\u0001\\\u0001\\\u0005\\\u08fd\b\\\n\\\f\\\u0900\t\\"+
		"\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0003]\u0911\b]\u0001^\u0001^\u0001"+
		"^\u0003^\u0916\b^\u0001_\u0001_\u0001`\u0003`\u091b\b`\u0001`\u0001`\u0003"+
		"`\u091f\b`\u0001`\u0001`\u0003`\u0923\b`\u0001`\u0001`\u0003`\u0927\b"+
		"`\u0001`\u0001`\u0003`\u092b\b`\u0001`\u0001`\u0003`\u092f\b`\u0001`\u0001"+
		"`\u0003`\u0933\b`\u0001`\u0003`\u0936\b`\u0001a\u0001a\u0001a\u0005\u02f1"+
		"\u032a\u0332\u0339\u0341\u0004F\u0086\u008c\u008eb\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u0000\u001b\u0001\u0000\u00c4\u00c5\u0002"+
		"\u0000MMOO\u0003\u0000WY\u00aa\u00aa\u00b0\u00b0\u0002\u0000\u000b\u000b"+
		"\u001d\u001d\u0002\u0000**TT\u0002\u0000\u00aa\u00aa\u00b0\u00b0\u0002"+
		"\u0000\f\f\u00d1\u00d1\u0001\u0000cf\u0001\u0000)*\u0002\u0000FFHH\u0001"+
		"\u0000\u000e\u000f\u0001\u0000\u00f3\u00f4\u0001\u0000\"#\u0002\u0000"+
		"\u0086\u0087\u008c\u008c\u0001\u0000\u0088\u008b\u0002\u0000\u0086\u0087"+
		"\u008f\u008f\u0001\u0000\u00ec\u00ed\u0001\u0000y{\u0001\u0000~\u0085"+
		"\u0001\u0000\u0086\u0090\u0001\u0000\u001b\u001e\u0001\u0000&\'\u0001"+
		"\u0000\u0086\u0087\u0002\u0000??\u0097\u0097\u0002\u0000\u0017\u0017\u0095"+
		"\u0095\u0001\u0000CD\b\u0000\n144<bg}\u008b\u008b\u0091\u009a\u009c\u00e8"+
		"\u00ea\u00ed\u0ac5\u0000\u00c4\u0001\u0000\u0000\u0000\u0002\u00c7\u0001"+
		"\u0000\u0000\u0000\u0004\u00ca\u0001\u0000\u0000\u0000\u0006\u00cd\u0001"+
		"\u0000\u0000\u0000\b\u00d0\u0001\u0000\u0000\u0000\n\u00d3\u0001\u0000"+
		"\u0000\u0000\f\u0344\u0001\u0000\u0000\u0000\u000e\u03f0\u0001\u0000\u0000"+
		"\u0000\u0010\u03f2\u0001\u0000\u0000\u0000\u0012\u0401\u0001\u0000\u0000"+
		"\u0000\u0014\u040d\u0001\u0000\u0000\u0000\u0016\u041a\u0001\u0000\u0000"+
		"\u0000\u0018\u041e\u0001\u0000\u0000\u0000\u001a\u0452\u0001\u0000\u0000"+
		"\u0000\u001c\u0454\u0001\u0000\u0000\u0000\u001e\u0458\u0001\u0000\u0000"+
		"\u0000 \u0464\u0001\u0000\u0000\u0000\"\u046e\u0001\u0000\u0000\u0000"+
		"$\u0470\u0001\u0000\u0000\u0000&\u0478\u0001\u0000\u0000\u0000(\u0481"+
		"\u0001\u0000\u0000\u0000*\u0489\u0001\u0000\u0000\u0000,\u048c\u0001\u0000"+
		"\u0000\u0000.\u0497\u0001\u0000\u0000\u00000\u04a7\u0001\u0000\u0000\u0000"+
		"2\u04ad\u0001\u0000\u0000\u00004\u04af\u0001\u0000\u0000\u00006\u04ba"+
		"\u0001\u0000\u0000\u00008\u04cb\u0001\u0000\u0000\u0000:\u04d2\u0001\u0000"+
		"\u0000\u0000<\u04d4\u0001\u0000\u0000\u0000>\u04da\u0001\u0000\u0000\u0000"+
		"@\u04e9\u0001\u0000\u0000\u0000B\u04f5\u0001\u0000\u0000\u0000D\u0526"+
		"\u0001\u0000\u0000\u0000F\u052b\u0001\u0000\u0000\u0000H\u0541\u0001\u0000"+
		"\u0000\u0000J\u0543\u0001\u0000\u0000\u0000L\u05a8\u0001\u0000\u0000\u0000"+
		"N\u05aa\u0001\u0000\u0000\u0000P\u05c4\u0001\u0000\u0000\u0000R\u05c6"+
		"\u0001\u0000\u0000\u0000T\u05d5\u0001\u0000\u0000\u0000V\u05ff\u0001\u0000"+
		"\u0000\u0000X\u0601\u0001\u0000\u0000\u0000Z\u0621\u0001\u0000\u0000\u0000"+
		"\\\u0623\u0001\u0000\u0000\u0000^\u0635\u0001\u0000\u0000\u0000`\u064d"+
		"\u0001\u0000\u0000\u0000b\u065d\u0001\u0000\u0000\u0000d\u065f\u0001\u0000"+
		"\u0000\u0000f\u067d\u0001\u0000\u0000\u0000h\u0681\u0001\u0000\u0000\u0000"+
		"j\u0689\u0001\u0000\u0000\u0000l\u0694\u0001\u0000\u0000\u0000n\u0698"+
		"\u0001\u0000\u0000\u0000p\u06a3\u0001\u0000\u0000\u0000r\u06c0\u0001\u0000"+
		"\u0000\u0000t\u06c2\u0001\u0000\u0000\u0000v\u06cd\u0001\u0000\u0000\u0000"+
		"x\u06e3\u0001\u0000\u0000\u0000z\u0716\u0001\u0000\u0000\u0000|\u071b"+
		"\u0001\u0000\u0000\u0000~\u0722\u0001\u0000\u0000\u0000\u0080\u0726\u0001"+
		"\u0000\u0000\u0000\u0082\u0730\u0001\u0000\u0000\u0000\u0084\u0738\u0001"+
		"\u0000\u0000\u0000\u0086\u0743\u0001\u0000\u0000\u0000\u0088\u0750\u0001"+
		"\u0000\u0000\u0000\u008a\u0784\u0001\u0000\u0000\u0000\u008c\u078a\u0001"+
		"\u0000\u0000\u0000\u008e\u0821\u0001\u0000\u0000\u0000\u0090\u083c\u0001"+
		"\u0000\u0000\u0000\u0092\u083e\u0001\u0000\u0000\u0000\u0094\u0840\u0001"+
		"\u0000\u0000\u0000\u0096\u0842\u0001\u0000\u0000\u0000\u0098\u0844\u0001"+
		"\u0000\u0000\u0000\u009a\u0846\u0001\u0000\u0000\u0000\u009c\u084d\u0001"+
		"\u0000\u0000\u0000\u009e\u0858\u0001\u0000\u0000\u0000\u00a0\u085d\u0001"+
		"\u0000\u0000\u0000\u00a2\u0881\u0001\u0000\u0000\u0000\u00a4\u0883\u0001"+
		"\u0000\u0000\u0000\u00a6\u088b\u0001\u0000\u0000\u0000\u00a8\u0891\u0001"+
		"\u0000\u0000\u0000\u00aa\u0899\u0001\u0000\u0000\u0000\u00ac\u08a0\u0001"+
		"\u0000\u0000\u0000\u00ae\u08a5\u0001\u0000\u0000\u0000\u00b0\u08ae\u0001"+
		"\u0000\u0000\u0000\u00b2\u08dc\u0001\u0000\u0000\u0000\u00b4\u08ee\u0001"+
		"\u0000\u0000\u0000\u00b6\u08f7\u0001\u0000\u0000\u0000\u00b8\u08f9\u0001"+
		"\u0000\u0000\u0000\u00ba\u0910\u0001\u0000\u0000\u0000\u00bc\u0915\u0001"+
		"\u0000\u0000\u0000\u00be\u0917\u0001\u0000\u0000\u0000\u00c0\u0935\u0001"+
		"\u0000\u0000\u0000\u00c2\u0937\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003"+
		"\f\u0006\u0000\u00c5\u00c6\u0005\u0000\u0000\u0001\u00c6\u0001\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0003\u0080@\u0000\u00c8\u00c9\u0005\u0000\u0000"+
		"\u0001\u00c9\u0003\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003|>\u0000\u00cb"+
		"\u00cc\u0005\u0000\u0000\u0001\u00cc\u0005\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0003~?\u0000\u00ce\u00cf\u0005\u0000\u0000\u0001\u00cf\u0007\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0003\u00a2Q\u0000\u00d1\u00d2\u0005\u0000"+
		"\u0000\u0001\u00d2\t\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003\u00a4R"+
		"\u0000\u00d4\u00d5\u0005\u0000\u0000\u0001\u00d5\u000b\u0001\u0000\u0000"+
		"\u0000\u00d6\u0345\u0003\u0018\f\u0000\u00d7\u00d8\u0005_\u0000\u0000"+
		"\u00d8\u0345\u0003\u00ba]\u0000\u00d9\u00da\u0005L\u0000\u0000\u00da\u00de"+
		"\u0005\u00cb\u0000\u0000\u00db\u00dc\u0005|\u0000\u0000\u00dc\u00dd\u0005"+
		"\u001e\u0000\u0000\u00dd\u00df\u0005 \u0000\u0000\u00de\u00db\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e3\u0003\u00ba]\u0000\u00e1\u00e2\u0005o\u0000\u0000"+
		"\u00e2\u00e4\u0005\u00ee\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e7\u0003\u0016\u000b\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00eb\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005J\u0000\u0000\u00e9\u00ea\u0005\u00b6\u0000\u0000\u00ea"+
		"\u00ec\u0003,\u0016\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ec\u0345\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0005j\u0000\u0000\u00ee\u00ef\u0005\u00cb\u0000\u0000\u00ef\u00f0\u0003"+
		"\u00ba]\u0000\u00f0\u00f1\u0005p\u0000\u0000\u00f1\u00f2\u0005\u00b6\u0000"+
		"\u0000\u00f2\u00f3\u0003,\u0016\u0000\u00f3\u0345\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005b\u0000\u0000\u00f5\u00f8\u0005\u00cb\u0000\u0000\u00f6"+
		"\u00f7\u0005|\u0000\u0000\u00f7\u00f9\u0005 \u0000\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u0003\u00ba]\u0000\u00fb\u00fd\u0007\u0000"+
		"\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u0345\u0001\u0000\u0000\u0000\u00fe\u0103\u0003\u0010"+
		"\b\u0000\u00ff\u0100\u0005\u0001\u0000\u0000\u0100\u0101\u0003\u00a4R"+
		"\u0000\u0101\u0102\u0005\u0002\u0000\u0000\u0102\u0104\u0001\u0000\u0000"+
		"\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0108\u0003*\u0015\u0000"+
		"\u0106\u0107\u0005\u00b3\u0000\u0000\u0107\u0109\u0003,\u0016\u0000\u0108"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\u010d\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u00d3\u0000\u0000\u010b"+
		"\u010c\u0005\u0012\u0000\u0000\u010c\u010e\u0003f3\u0000\u010d\u010a\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001"+
		"\u0000\u0000\u0000\u010f\u0111\u0003\u0012\t\u0000\u0110\u010f\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000"+
		"\u0000\u0000\u0112\u0114\u0003\u0016\u000b\u0000\u0113\u0112\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0005o\u0000\u0000\u0116\u0118\u0005\u00ee\u0000"+
		"\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000"+
		"\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u00b5\u0000"+
		"\u0000\u011a\u011c\u0003,\u0016\u0000\u011b\u0119\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u0121\u0001\u0000\u0000\u0000"+
		"\u011d\u011f\u0005\r\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u0122\u0003\u0018\f\u0000\u0121\u011e\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0001\u0000\u0000\u0000\u0122\u0345\u0001\u0000\u0000\u0000\u0123\u0128"+
		"\u0003\u0010\b\u0000\u0124\u0125\u0005\u0001\u0000\u0000\u0125\u0126\u0003"+
		"\u00a4R\u0000\u0126\u0127\u0005\u0002\u0000\u0000\u0127\u0129\u0001\u0000"+
		"\u0000\u0000\u0128\u0124\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u012b\u0005o\u0000"+
		"\u0000\u012b\u012d\u0005\u00ee\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0134\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0005\u00d3\u0000\u0000\u012f\u0130\u0005\u0012\u0000"+
		"\u0000\u0130\u0131\u0005\u0001\u0000\u0000\u0131\u0132\u0003\u00a4R\u0000"+
		"\u0132\u0133\u0005\u0002\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000"+
		"\u0134\u012e\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0138\u0003\u0012\t\u0000\u0137"+
		"\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u013a\u0001\u0000\u0000\u0000\u0139\u013b\u0003\u0014\n\u0000\u013a\u0139"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d"+
		"\u0001\u0000\u0000\u0000\u013c\u013e\u0003z=\u0000\u013d\u013c\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000"+
		"\u0000\u0000\u013f\u0141\u00038\u001c\u0000\u0140\u013f\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000\u0000"+
		"\u0000\u0142\u0144\u0003\u0016\u000b\u0000\u0143\u0142\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0005\u00b5\u0000\u0000\u0146\u0148\u0003,\u0016\u0000"+
		"\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000"+
		"\u0148\u014d\u0001\u0000\u0000\u0000\u0149\u014b\u0005\r\u0000\u0000\u014a"+
		"\u0149\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0001\u0000\u0000\u0000\u014c\u014e\u0003\u0018\f\u0000\u014d\u014a"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0345"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0005L\u0000\u0000\u0150\u0154\u0005"+
		"M\u0000\u0000\u0151\u0152\u0005|\u0000\u0000\u0152\u0153\u0005\u001e\u0000"+
		"\u0000\u0153\u0155\u0005 \u0000\u0000\u0154\u0151\u0001\u0000\u0000\u0000"+
		"\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0003|>\u0000\u0157\u0158\u0005\"\u0000\u0000\u0158\u015a"+
		"\u0003|>\u0000\u0159\u015b\u0003\u0016\u000b\u0000\u015a\u0159\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u0345\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0005\u00cf\u0000\u0000\u015d\u015e\u0005M\u0000"+
		"\u0000\u015e\u0160\u0003|>\u0000\u015f\u0161\u0003\u001e\u000f\u0000\u0160"+
		"\u015f\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u00d0\u0000\u0000\u0163"+
		"\u0168\u0005\u00d2\u0000\u0000\u0164\u0169\u0003\u00ba]\u0000\u0165\u0166"+
		"\u0005+\u0000\u0000\u0166\u0167\u0005]\u0000\u0000\u0167\u0169\u0003h"+
		"4\u0000\u0168\u0164\u0001\u0000\u0000\u0000\u0168\u0165\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u0345\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0005j\u0000\u0000\u016b\u016c\u0005M\u0000\u0000\u016c"+
		"\u016d\u0003|>\u0000\u016d\u016e\u0005\f\u0000\u0000\u016e\u016f\u0005"+
		"]\u0000\u0000\u016f\u0170\u0005\u0001\u0000\u0000\u0170\u0171\u0003\u00a4"+
		"R\u0000\u0171\u0172\u0005\u0002\u0000\u0000\u0172\u0345\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0005j\u0000\u0000\u0174\u0175\u0007\u0001\u0000\u0000"+
		"\u0175\u0176\u0003|>\u0000\u0176\u0177\u0005k\u0000\u0000\u0177\u0178"+
		"\u0005g\u0000\u0000\u0178\u0179\u0003|>\u0000\u0179\u0345\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0005j\u0000\u0000\u017b\u017c\u0007\u0001\u0000"+
		"\u0000\u017c\u017d\u0003|>\u0000\u017d\u017e\u0005p\u0000\u0000\u017e"+
		"\u017f\u0005\u00b5\u0000\u0000\u017f\u0180\u0003,\u0016\u0000\u0180\u0345"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0005j\u0000\u0000\u0182\u0183\u0007"+
		"\u0001\u0000\u0000\u0183\u0184\u0003|>\u0000\u0184\u0185\u0005\u00b4\u0000"+
		"\u0000\u0185\u0188\u0005\u00b5\u0000\u0000\u0186\u0187\u0005|\u0000\u0000"+
		"\u0187\u0189\u0005 \u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0003,\u0016\u0000\u018b\u0345\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0005j\u0000\u0000\u018d\u018e\u0005M\u0000\u0000\u018e\u0190\u0003|"+
		">\u0000\u018f\u0191\u0003\u001e\u000f\u0000\u0190\u018f\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000"+
		"\u0000\u0192\u0194\u0005\u00c3\u0000\u0000\u0193\u0195\u0005^\u0000\u0000"+
		"\u0194\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0003\u00ba]\u0000\u0197"+
		"\u0199\u0003\u00a6S\u0000\u0198\u019a\u0003\u00a0P\u0000\u0199\u0198\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u0345\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0005j\u0000\u0000\u019c\u019d\u0005M\u0000"+
		"\u0000\u019d\u019f\u0003|>\u0000\u019e\u01a0\u0003\u001e\u000f\u0000\u019f"+
		"\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005p\u0000\u0000\u01a2\u01a3"+
		"\u0005\u009c\u0000\u0000\u01a3\u01a7\u0005\u00ee\u0000\u0000\u01a4\u01a5"+
		"\u0005J\u0000\u0000\u01a5\u01a6\u0005\u009d\u0000\u0000\u01a6\u01a8\u0003"+
		",\u0016\u0000\u01a7\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u0345\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005j\u0000"+
		"\u0000\u01aa\u01ab\u0005M\u0000\u0000\u01ab\u01ad\u0003|>\u0000\u01ac"+
		"\u01ae\u0003\u001e\u000f\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0005p\u0000\u0000\u01b0\u01b1\u0005\u009d\u0000\u0000\u01b1\u01b2"+
		"\u0003,\u0016\u0000\u01b2\u0345\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005"+
		"j\u0000\u0000\u01b4\u01b5\u0005M\u0000\u0000\u01b5\u01b6\u0003|>\u0000"+
		"\u01b6\u01ba\u0005\f\u0000\u0000\u01b7\u01b8\u0005|\u0000\u0000\u01b8"+
		"\u01b9\u0005\u001e\u0000\u0000\u01b9\u01bb\u0005 \u0000\u0000\u01ba\u01b7"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bc\u01be\u0003\u001c\u000e\u0000\u01bd\u01bc"+
		"\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u0345"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005j\u0000\u0000\u01c2\u01c3\u0005"+
		"O\u0000\u0000\u01c3\u01c4\u0003|>\u0000\u01c4\u01c8\u0005\f\u0000\u0000"+
		"\u01c5\u01c6\u0005|\u0000\u0000\u01c6\u01c7\u0005\u001e\u0000\u0000\u01c7"+
		"\u01c9\u0005 \u0000\u0000\u01c8\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01cc"+
		"\u0003\u001e\u000f\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0001\u0000\u0000\u0000\u01ce\u0345\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0005j\u0000\u0000\u01d0\u01d1\u0005M\u0000\u0000\u01d1\u01d2\u0003|"+
		">\u0000\u01d2\u01d3\u0003\u001e\u000f\u0000\u01d3\u01d4\u0005k\u0000\u0000"+
		"\u01d4\u01d5\u0005g\u0000\u0000\u01d5\u01d6\u0003\u001e\u000f\u0000\u01d6"+
		"\u0345\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005j\u0000\u0000\u01d8\u01d9"+
		"\u0005M\u0000\u0000\u01d9\u01da\u0003|>\u0000\u01da\u01dd\u0005b\u0000"+
		"\u0000\u01db\u01dc\u0005|\u0000\u0000\u01dc\u01de\u0005 \u0000\u0000\u01dd"+
		"\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de"+
		"\u01df\u0001\u0000\u0000\u0000\u01df\u01e4\u0003\u001e\u000f\u0000\u01e0"+
		"\u01e1\u0005\u0003\u0000\u0000\u01e1\u01e3\u0003\u001e\u000f\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e9\u0005\u00c8\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0001\u0000\u0000\u0000\u01e9\u0345\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0005j\u0000\u0000\u01eb\u01ec\u0005O\u0000\u0000\u01ec\u01ed\u0003"+
		"|>\u0000\u01ed\u01f0\u0005b\u0000\u0000\u01ee\u01ef\u0005|\u0000\u0000"+
		"\u01ef\u01f1\u0005 \u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f7\u0003\u001e\u000f\u0000\u01f3\u01f4\u0005\u0003\u0000\u0000\u01f4"+
		"\u01f6\u0003\u001e\u000f\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f8\u0345\u0001\u0000\u0000\u0000\u01f9"+
		"\u01f7\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005j\u0000\u0000\u01fb\u01fc"+
		"\u0005M\u0000\u0000\u01fc\u01fe\u0003|>\u0000\u01fd\u01ff\u0003\u001e"+
		"\u000f\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0005p\u0000"+
		"\u0000\u0201\u0202\u0003\u0016\u000b\u0000\u0202\u0345\u0001\u0000\u0000"+
		"\u0000\u0203\u0204\u0005j\u0000\u0000\u0204\u0205\u0005M\u0000\u0000\u0205"+
		"\u0206\u0003|>\u0000\u0206\u0207\u0005\u00dc\u0000\u0000\u0207\u0208\u0005"+
		"`\u0000\u0000\u0208\u0345\u0001\u0000\u0000\u0000\u0209\u020a\u0005b\u0000"+
		"\u0000\u020a\u020d\u0005M\u0000\u0000\u020b\u020c\u0005|\u0000\u0000\u020c"+
		"\u020e\u0005 \u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020e"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0211"+
		"\u0003|>\u0000\u0210\u0212\u0005\u00c8\u0000\u0000\u0211\u0210\u0001\u0000"+
		"\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0345\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0005b\u0000\u0000\u0214\u0217\u0005O\u0000\u0000"+
		"\u0215\u0216\u0005|\u0000\u0000\u0216\u0218\u0005 \u0000\u0000\u0217\u0215"+
		"\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219"+
		"\u0001\u0000\u0000\u0000\u0219\u0345\u0003|>\u0000\u021a\u021d\u0005L"+
		"\u0000\u0000\u021b\u021c\u0005\u001b\u0000\u0000\u021c\u021e\u0005P\u0000"+
		"\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000"+
		"\u0000\u021e\u0223\u0001\u0000\u0000\u0000\u021f\u0221\u0005\u00b1\u0000"+
		"\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0224\u0005\u00b2\u0000"+
		"\u0000\u0223\u0220\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0229\u0005O\u0000\u0000"+
		"\u0226\u0227\u0005|\u0000\u0000\u0227\u0228\u0005\u001e\u0000\u0000\u0228"+
		"\u022a\u0005 \u0000\u0000\u0229\u0226\u0001\u0000\u0000\u0000\u0229\u022a"+
		"\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022d"+
		"\u0003|>\u0000\u022c\u022e\u0003n7\u0000\u022d\u022c\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u0231\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0005o\u0000\u0000\u0230\u0232\u0005\u00ee\u0000\u0000"+
		"\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000"+
		"\u0232\u0236\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u00d3\u0000\u0000"+
		"\u0234\u0235\u0005;\u0000\u0000\u0235\u0237\u0003f3\u0000\u0236\u0233"+
		"\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u023a"+
		"\u0001\u0000\u0000\u0000\u0238\u0239\u0005\u00b5\u0000\u0000\u0239\u023b"+
		"\u0003,\u0016\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001"+
		"\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023d\u0005"+
		"\r\u0000\u0000\u023d\u023e\u0003\u0018\f\u0000\u023e\u0345\u0001\u0000"+
		"\u0000\u0000\u023f\u0242\u0005L\u0000\u0000\u0240\u0241\u0005\u001b\u0000"+
		"\u0000\u0241\u0243\u0005P\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0245\u0001\u0000\u0000\u0000"+
		"\u0244\u0246\u0005\u00b1\u0000\u0000\u0245\u0244\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0005\u00b2\u0000\u0000\u0248\u0249\u0005O\u0000\u0000\u0249"+
		"\u024e\u0003|>\u0000\u024a\u024b\u0005\u0001\u0000\u0000\u024b\u024c\u0003"+
		"\u00a4R\u0000\u024c\u024d\u0005\u0002\u0000\u0000\u024d\u024f\u0001\u0000"+
		"\u0000\u0000\u024e\u024a\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000"+
		"\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0253\u0003*\u0015"+
		"\u0000\u0251\u0252\u0005\u00b3\u0000\u0000\u0252\u0254\u0003,\u0016\u0000"+
		"\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000"+
		"\u0254\u0345\u0001\u0000\u0000\u0000\u0255\u0256\u0005j\u0000\u0000\u0256"+
		"\u0257\u0005O\u0000\u0000\u0257\u0259\u0003|>\u0000\u0258\u025a\u0005"+
		"\r\u0000\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000"+
		"\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0003\u0018"+
		"\f\u0000\u025c\u0345\u0001\u0000\u0000\u0000\u025d\u0260\u0005L\u0000"+
		"\u0000\u025e\u025f\u0005\u001b\u0000\u0000\u025f\u0261\u0005P\u0000\u0000"+
		"\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000"+
		"\u0261\u0263\u0001\u0000\u0000\u0000\u0262\u0264\u0005\u00b2\u0000\u0000"+
		"\u0263\u0262\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000"+
		"\u0264\u0265\u0001\u0000\u0000\u0000\u0265\u0269\u0005\u00a9\u0000\u0000"+
		"\u0266\u0267\u0005|\u0000\u0000\u0267\u0268\u0005\u001e\u0000\u0000\u0268"+
		"\u026a\u0005 \u0000\u0000\u0269\u0266\u0001\u0000\u0000\u0000\u0269\u026a"+
		"\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c"+
		"\u0003\u00b8\\\u0000\u026c\u026d\u0005\r\u0000\u0000\u026d\u0277\u0005"+
		"\u00ee\u0000\u0000\u026e\u026f\u0005\u009b\u0000\u0000\u026f\u0274\u0003"+
		">\u001f\u0000\u0270\u0271\u0005\u0003\u0000\u0000\u0271\u0273\u0003>\u001f"+
		"\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0273\u0276\u0001\u0000\u0000"+
		"\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000"+
		"\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000"+
		"\u0000\u0277\u026e\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000"+
		"\u0000\u0278\u0345\u0001\u0000\u0000\u0000\u0279\u027b\u0005b\u0000\u0000"+
		"\u027a\u027c\u0005\u00b2\u0000\u0000\u027b\u027a\u0001\u0000\u0000\u0000"+
		"\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000"+
		"\u027d\u0280\u0005\u00a9\u0000\u0000\u027e\u027f\u0005|\u0000\u0000\u027f"+
		"\u0281\u0005 \u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281"+
		"\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0345"+
		"\u0003\u00b8\\\u0000\u0283\u0285\u0005U\u0000\u0000\u0284\u0286\u0007"+
		"\u0002\u0000\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0285\u0286\u0001"+
		"\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0345\u0003"+
		"\f\u0006\u0000\u0288\u0289\u0005[\u0000\u0000\u0289\u028c\u0005\\\u0000"+
		"\u0000\u028a\u028b\u0007\u0003\u0000\u0000\u028b\u028d\u0003\u00ba]\u0000"+
		"\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000"+
		"\u028d\u0292\u0001\u0000\u0000\u0000\u028e\u0290\u0005\"\u0000\u0000\u028f"+
		"\u028e\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290"+
		"\u0291\u0001\u0000\u0000\u0000\u0291\u0293\u0005\u00ee\u0000\u0000\u0292"+
		"\u028f\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293"+
		"\u0345\u0001\u0000\u0000\u0000\u0294\u0295\u0005[\u0000\u0000\u0295\u0296"+
		"\u0005M\u0000\u0000\u0296\u0299\u0005\u00aa\u0000\u0000\u0297\u0298\u0007"+
		"\u0003\u0000\u0000\u0298\u029a\u0003\u00ba]\u0000\u0299\u0297\u0001\u0000"+
		"\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000"+
		"\u0000\u0000\u029b\u029c\u0005\"\u0000\u0000\u029c\u029e\u0005\u00ee\u0000"+
		"\u0000\u029d\u029f\u0003\u001e\u000f\u0000\u029e\u029d\u0001\u0000\u0000"+
		"\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u0345\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u0005[\u0000\u0000\u02a1\u02a4\u0005\u00cc\u0000\u0000"+
		"\u02a2\u02a3\u0005\"\u0000\u0000\u02a3\u02a5\u0005\u00ee\u0000\u0000\u02a4"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5"+
		"\u0345\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005[\u0000\u0000\u02a7\u02a8"+
		"\u0005\u00b5\u0000\u0000\u02a8\u02ad\u0003|>\u0000\u02a9\u02aa\u0005\u0001"+
		"\u0000\u0000\u02aa\u02ab\u00030\u0018\u0000\u02ab\u02ac\u0005\u0002\u0000"+
		"\u0000\u02ac\u02ae\u0001\u0000\u0000\u0000\u02ad\u02a9\u0001\u0000\u0000"+
		"\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u0345\u0001\u0000\u0000"+
		"\u0000\u02af\u02b0\u0005[\u0000\u0000\u02b0\u02b1\u0005]\u0000\u0000\u02b1"+
		"\u02b2\u0007\u0003\u0000\u0000\u02b2\u02b5\u0003|>\u0000\u02b3\u02b4\u0007"+
		"\u0003\u0000\u0000\u02b4\u02b6\u0003\u00ba]\u0000\u02b5\u02b3\u0001\u0000"+
		"\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u0345\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b8\u0005[\u0000\u0000\u02b8\u02b9\u0005`\u0000\u0000"+
		"\u02b9\u02bb\u0003|>\u0000\u02ba\u02bc\u0003\u001e\u000f\u0000\u02bb\u02ba"+
		"\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u0345"+
		"\u0001\u0000\u0000\u0000\u02bd\u02bf\u0005[\u0000\u0000\u02be\u02c0\u0003"+
		"\u00ba]\u0000\u02bf\u02be\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c9\u0005a\u0000"+
		"\u0000\u02c2\u02c4\u0005\"\u0000\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000"+
		"\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c5\u02c8\u0003\u00b8\\\u0000\u02c6\u02c8\u0005\u00ee\u0000\u0000\u02c7"+
		"\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8"+
		"\u02ca\u0001\u0000\u0000\u0000\u02c9\u02c3\u0001\u0000\u0000\u0000\u02c9"+
		"\u02ca\u0001\u0000\u0000\u0000\u02ca\u0345\u0001\u0000\u0000\u0000\u02cb"+
		"\u02cc\u0005[\u0000\u0000\u02cc\u02cd\u0005L\u0000\u0000\u02cd\u02ce\u0005"+
		"M\u0000\u0000\u02ce\u0345\u0003|>\u0000\u02cf\u02d0\u0007\u0004\u0000"+
		"\u0000\u02d0\u02d2\u0005\u00a9\u0000\u0000\u02d1\u02d3\u0005\u00aa\u0000"+
		"\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u0345\u0003\"\u0011\u0000"+
		"\u02d5\u02d6\u0007\u0004\u0000\u0000\u02d6\u02d8\u0005\u00cb\u0000\u0000"+
		"\u02d7\u02d9\u0005\u00aa\u0000\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000"+
		"\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000"+
		"\u02da\u0345\u0003\u00ba]\u0000\u02db\u02dd\u0007\u0004\u0000\u0000\u02dc"+
		"\u02de\u0005M\u0000\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000\u02dd\u02de"+
		"\u0001\u0000\u0000\u0000\u02de\u02e0\u0001\u0000\u0000\u0000\u02df\u02e1"+
		"\u0007\u0005\u0000\u0000\u02e0\u02df\u0001\u0000\u0000\u0000\u02e0\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e4"+
		"\u0003|>\u0000\u02e3\u02e5\u0003\u001e\u000f\u0000\u02e4\u02e3\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5\u02e7\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e8\u0003$\u0012\u0000\u02e7\u02e6\u0001\u0000\u0000"+
		"\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u0345\u0001\u0000\u0000"+
		"\u0000\u02e9\u02ea\u0005\u00ab\u0000\u0000\u02ea\u02eb\u0005M\u0000\u0000"+
		"\u02eb\u0345\u0003|>\u0000\u02ec\u02f4\u0005\u00ab\u0000\u0000\u02ed\u02f5"+
		"\u0005\u00ee\u0000\u0000\u02ee\u02f0\t\u0000\u0000\u0000\u02ef\u02ee\u0001"+
		"\u0000\u0000\u0000\u02f0\u02f3\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f2\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f4\u02ed\u0001"+
		"\u0000\u0000\u0000\u02f4\u02f1\u0001\u0000\u0000\u0000\u02f5\u0345\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f8\u0005\u00ad\u0000\u0000\u02f7\u02f9\u0005"+
		"\u00af\u0000\u0000\u02f8\u02f7\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005"+
		"M\u0000\u0000\u02fb\u0300\u0003|>\u0000\u02fc\u02fe\u0005\r\u0000\u0000"+
		"\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000"+
		"\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0301\u0003\u0018\f\u0000\u0300"+
		"\u02fd\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301"+
		"\u0345\u0001\u0000\u0000\u0000\u0302\u0303\u0005\u00ae\u0000\u0000\u0303"+
		"\u0306\u0005M\u0000\u0000\u0304\u0305\u0005|\u0000\u0000\u0305\u0307\u0005"+
		" \u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000"+
		"\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u0345\u0003|>\u0000"+
		"\u0309\u030a\u0005\u00ac\u0000\u0000\u030a\u0345\u0005\u00ad\u0000\u0000"+
		"\u030b\u030c\u0005\u00df\u0000\u0000\u030c\u030e\u0005r\u0000\u0000\u030d"+
		"\u030f\u0005\u00ea\u0000\u0000\u030e\u030d\u0001\u0000\u0000\u0000\u030e"+
		"\u030f\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310"+
		"\u0311\u0005\u00eb\u0000\u0000\u0311\u0313\u0005\u00ee\u0000\u0000\u0312"+
		"\u0314\u0005\u0098\u0000\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0313"+
		"\u0314\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315"+
		"\u0316\u0005S\u0000\u0000\u0316\u0317\u0005M\u0000\u0000\u0317\u0319\u0003"+
		"|>\u0000\u0318\u031a\u0003\u001e\u000f\u0000\u0319\u0318\u0001\u0000\u0000"+
		"\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u0345\u0001\u0000\u0000"+
		"\u0000\u031b\u031c\u0005\u00ce\u0000\u0000\u031c\u031d\u0005M\u0000\u0000"+
		"\u031d\u031f\u0003|>\u0000\u031e\u0320\u0003\u001e\u000f\u0000\u031f\u031e"+
		"\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320\u0345"+
		"\u0001\u0000\u0000\u0000\u0321\u0322\u0005\u00da\u0000\u0000\u0322\u0323"+
		"\u0005\u00db\u0000\u0000\u0323\u0324\u0005M\u0000\u0000\u0324\u0345\u0003"+
		"|>\u0000\u0325\u0326\u0007\u0006\u0000\u0000\u0326\u032a\u0003\u00ba]"+
		"\u0000\u0327\u0329\t\u0000\u0000\u0000\u0328\u0327\u0001\u0000\u0000\u0000"+
		"\u0329\u032c\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000"+
		"\u032a\u0328\u0001\u0000\u0000\u0000\u032b\u0345\u0001\u0000\u0000\u0000"+
		"\u032c\u032a\u0001\u0000\u0000\u0000\u032d\u032e\u0005p\u0000\u0000\u032e"+
		"\u0332\u0005\u00e0\u0000\u0000\u032f\u0331\t\u0000\u0000\u0000\u0330\u032f"+
		"\u0001\u0000\u0000\u0000\u0331\u0334\u0001\u0000\u0000\u0000\u0332\u0333"+
		"\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000\u0000\u0000\u0333\u0345"+
		"\u0001\u0000\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0335\u0339"+
		"\u0005p\u0000\u0000\u0336\u0338\t\u0000\u0000\u0000\u0337\u0336\u0001"+
		"\u0000\u0000\u0000\u0338\u033b\u0001\u0000\u0000\u0000\u0339\u033a\u0001"+
		"\u0000\u0000\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u033a\u0345\u0001"+
		"\u0000\u0000\u0000\u033b\u0339\u0001\u0000\u0000\u0000\u033c\u0345\u0005"+
		"q\u0000\u0000\u033d\u0341\u0003\u000e\u0007\u0000\u033e\u0340\t\u0000"+
		"\u0000\u0000\u033f\u033e\u0001\u0000\u0000\u0000\u0340\u0343\u0001\u0000"+
		"\u0000\u0000\u0341\u0342\u0001\u0000\u0000\u0000\u0341\u033f\u0001\u0000"+
		"\u0000\u0000\u0342\u0345\u0001\u0000\u0000\u0000\u0343\u0341\u0001\u0000"+
		"\u0000\u0000\u0344\u00d6\u0001\u0000\u0000\u0000\u0344\u00d7\u0001\u0000"+
		"\u0000\u0000\u0344\u00d9\u0001\u0000\u0000\u0000\u0344\u00ed\u0001\u0000"+
		"\u0000\u0000\u0344\u00f4\u0001\u0000\u0000\u0000\u0344\u00fe\u0001\u0000"+
		"\u0000\u0000\u0344\u0123\u0001\u0000\u0000\u0000\u0344\u014f\u0001\u0000"+
		"\u0000\u0000\u0344\u015c\u0001\u0000\u0000\u0000\u0344\u016a\u0001\u0000"+
		"\u0000\u0000\u0344\u0173\u0001\u0000\u0000\u0000\u0344\u017a\u0001\u0000"+
		"\u0000\u0000\u0344\u0181\u0001\u0000\u0000\u0000\u0344\u018c\u0001\u0000"+
		"\u0000\u0000\u0344\u019b\u0001\u0000\u0000\u0000\u0344\u01a9\u0001\u0000"+
		"\u0000\u0000\u0344\u01b3\u0001\u0000\u0000\u0000\u0344\u01c1\u0001\u0000"+
		"\u0000\u0000\u0344\u01cf\u0001\u0000\u0000\u0000\u0344\u01d7\u0001\u0000"+
		"\u0000\u0000\u0344\u01ea\u0001\u0000\u0000\u0000\u0344\u01fa\u0001\u0000"+
		"\u0000\u0000\u0344\u0203\u0001\u0000\u0000\u0000\u0344\u0209\u0001\u0000"+
		"\u0000\u0000\u0344\u0213\u0001\u0000\u0000\u0000\u0344\u021a\u0001\u0000"+
		"\u0000\u0000\u0344\u023f\u0001\u0000\u0000\u0000\u0344\u0255\u0001\u0000"+
		"\u0000\u0000\u0344\u025d\u0001\u0000\u0000\u0000\u0344\u0279\u0001\u0000"+
		"\u0000\u0000\u0344\u0283\u0001\u0000\u0000\u0000\u0344\u0288\u0001\u0000"+
		"\u0000\u0000\u0344\u0294\u0001\u0000\u0000\u0000\u0344\u02a0\u0001\u0000"+
		"\u0000\u0000\u0344\u02a6\u0001\u0000\u0000\u0000\u0344\u02af\u0001\u0000"+
		"\u0000\u0000\u0344\u02b7\u0001\u0000\u0000\u0000\u0344\u02bd\u0001\u0000"+
		"\u0000\u0000\u0344\u02cb\u0001\u0000\u0000\u0000\u0344\u02cf\u0001\u0000"+
		"\u0000\u0000\u0344\u02d5\u0001\u0000\u0000\u0000\u0344\u02db\u0001\u0000"+
		"\u0000\u0000\u0344\u02e9\u0001\u0000\u0000\u0000\u0344\u02ec\u0001\u0000"+
		"\u0000\u0000\u0344\u02f6\u0001\u0000\u0000\u0000\u0344\u0302\u0001\u0000"+
		"\u0000\u0000\u0344\u0309\u0001\u0000\u0000\u0000\u0344\u030b\u0001\u0000"+
		"\u0000\u0000\u0344\u031b\u0001\u0000\u0000\u0000\u0344\u0321\u0001\u0000"+
		"\u0000\u0000\u0344\u0325\u0001\u0000\u0000\u0000\u0344\u032d\u0001\u0000"+
		"\u0000\u0000\u0344\u0335\u0001\u0000\u0000\u0000\u0344\u033c\u0001\u0000"+
		"\u0000\u0000\u0344\u033d\u0001\u0000\u0000\u0000\u0345\r\u0001\u0000\u0000"+
		"\u0000\u0346\u0347\u0005L\u0000\u0000\u0347\u03f1\u0005\u00e0\u0000\u0000"+
		"\u0348\u0349\u0005b\u0000\u0000\u0349\u03f1\u0005\u00e0\u0000\u0000\u034a"+
		"\u034c\u0005\u00d7\u0000\u0000\u034b\u034d\u0005\u00e0\u0000\u0000\u034c"+
		"\u034b\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d"+
		"\u03f1\u0001\u0000\u0000\u0000\u034e\u0350\u0005\u00d6\u0000\u0000\u034f"+
		"\u0351\u0005\u00e0\u0000\u0000\u0350\u034f\u0001\u0000\u0000\u0000\u0350"+
		"\u0351\u0001\u0000\u0000\u0000\u0351\u03f1\u0001\u0000\u0000\u0000\u0352"+
		"\u0353\u0005[\u0000\u0000\u0353\u03f1\u0005\u00d7\u0000\u0000\u0354\u0355"+
		"\u0005[\u0000\u0000\u0355\u0357\u0005\u00e0\u0000\u0000\u0356\u0358\u0005"+
		"\u00d7\u0000\u0000\u0357\u0356\u0001\u0000\u0000\u0000\u0357\u0358\u0001"+
		"\u0000\u0000\u0000\u0358\u03f1\u0001\u0000\u0000\u0000\u0359\u035a\u0005"+
		"[\u0000\u0000\u035a\u03f1\u0005\u00e3\u0000\u0000\u035b\u035c\u0005[\u0000"+
		"\u0000\u035c\u03f1\u0005\u00e1\u0000\u0000\u035d\u035e\u0005[\u0000\u0000"+
		"\u035e\u035f\u0005E\u0000\u0000\u035f\u03f1\u0005\u00e1\u0000\u0000\u0360"+
		"\u0361\u0005\u00dd\u0000\u0000\u0361\u03f1\u0005M\u0000\u0000\u0362\u0363"+
		"\u0005\u00de\u0000\u0000\u0363\u03f1\u0005M\u0000\u0000\u0364\u0365\u0005"+
		"[\u0000\u0000\u0365\u03f1\u0005\u00e2\u0000\u0000\u0366\u0367\u0005[\u0000"+
		"\u0000\u0367\u0368\u0005L\u0000\u0000\u0368\u03f1\u0005M\u0000\u0000\u0369"+
		"\u036a\u0005[\u0000\u0000\u036a\u03f1\u0005\u00e4\u0000\u0000\u036b\u036c"+
		"\u0005[\u0000\u0000\u036c\u03f1\u0005\u00e6\u0000\u0000\u036d\u036e\u0005"+
		"[\u0000\u0000\u036e\u03f1\u0005\u00e7\u0000\u0000\u036f\u0370\u0005L\u0000"+
		"\u0000\u0370\u03f1\u0005\u00e5\u0000\u0000\u0371\u0372\u0005b\u0000\u0000"+
		"\u0372\u03f1\u0005\u00e5\u0000\u0000\u0373\u0374\u0005j\u0000\u0000\u0374"+
		"\u03f1\u0005\u00e5\u0000\u0000\u0375\u0376\u0005\u00d8\u0000\u0000\u0376"+
		"\u03f1\u0005M\u0000\u0000\u0377\u0378\u0005\u00d8\u0000\u0000\u0378\u03f1"+
		"\u0005\u00cb\u0000\u0000\u0379\u037a\u0005\u00d9\u0000\u0000\u037a\u03f1"+
		"\u0005M\u0000\u0000\u037b\u037c\u0005\u00d9\u0000\u0000\u037c\u03f1\u0005"+
		"\u00cb\u0000\u0000\u037d\u037e\u0005L\u0000\u0000\u037e\u037f\u0005\u00b2"+
		"\u0000\u0000\u037f\u03f1\u0005w\u0000\u0000\u0380\u0381\u0005b\u0000\u0000"+
		"\u0381\u0382\u0005\u00b2\u0000\u0000\u0382\u03f1\u0005w\u0000\u0000\u0383"+
		"\u0384\u0005j\u0000\u0000\u0384\u0385\u0005M\u0000\u0000\u0385\u0386\u0003"+
		"|>\u0000\u0386\u0387\u0005\u001e\u0000\u0000\u0387\u0388\u0005\u00c6\u0000"+
		"\u0000\u0388\u03f1\u0001\u0000\u0000\u0000\u0389\u038a\u0005j\u0000\u0000"+
		"\u038a\u038b\u0005M\u0000\u0000\u038b\u038c\u0003|>\u0000\u038c\u038d"+
		"\u0005\u00c6\u0000\u0000\u038d\u038e\u0005\u0012\u0000\u0000\u038e\u03f1"+
		"\u0001\u0000\u0000\u0000\u038f\u0390\u0005j\u0000\u0000\u0390\u0391\u0005"+
		"M\u0000\u0000\u0391\u0392\u0003|>\u0000\u0392\u0393\u0005\u001e\u0000"+
		"\u0000\u0393\u0394\u0005\u00c7\u0000\u0000\u0394\u03f1\u0001\u0000\u0000"+
		"\u0000\u0395\u0396\u0005j\u0000\u0000\u0396\u0397\u0005M\u0000\u0000\u0397"+
		"\u0398\u0003|>\u0000\u0398\u0399\u0005\u00b8\u0000\u0000\u0399\u039a\u0005"+
		"\u0012\u0000\u0000\u039a\u03f1\u0001\u0000\u0000\u0000\u039b\u039c\u0005"+
		"j\u0000\u0000\u039c\u039d\u0005M\u0000\u0000\u039d\u039e\u0003|>\u0000"+
		"\u039e\u039f\u0005\u001e\u0000\u0000\u039f\u03a0\u0005\u00b8\u0000\u0000"+
		"\u03a0\u03f1\u0001\u0000\u0000\u0000\u03a1\u03a2\u0005j\u0000\u0000\u03a2"+
		"\u03a3\u0005M\u0000\u0000\u03a3\u03a4\u0003|>\u0000\u03a4\u03a5\u0005"+
		"\u001e\u0000\u0000\u03a5\u03a6\u0005\u00b9\u0000\u0000\u03a6\u03a7\u0005"+
		"\r\u0000\u0000\u03a7\u03a8\u0005\u00ba\u0000\u0000\u03a8\u03f1\u0001\u0000"+
		"\u0000\u0000\u03a9\u03aa\u0005j\u0000\u0000\u03aa\u03ab\u0005M\u0000\u0000"+
		"\u03ab\u03ac\u0003|>\u0000\u03ac\u03ad\u0005p\u0000\u0000\u03ad\u03ae"+
		"\u0005\u00b8\u0000\u0000\u03ae\u03af\u0005\u00bb\u0000\u0000\u03af\u03f1"+
		"\u0001\u0000\u0000\u0000\u03b0\u03b1\u0005j\u0000\u0000\u03b1\u03b2\u0005"+
		"M\u0000\u0000\u03b2\u03b3\u0003|>\u0000\u03b3\u03b4\u0005\u00bc\u0000"+
		"\u0000\u03b4\u03b5\u0005?\u0000\u0000\u03b5\u03f1\u0001\u0000\u0000\u0000"+
		"\u03b6\u03b7\u0005j\u0000\u0000\u03b7\u03b8\u0005M\u0000\u0000\u03b8\u03b9"+
		"\u0003|>\u0000\u03b9\u03ba\u0005\u00bd\u0000\u0000\u03ba\u03bb\u0005?"+
		"\u0000\u0000\u03bb\u03f1\u0001\u0000\u0000\u0000\u03bc\u03bd\u0005j\u0000"+
		"\u0000\u03bd\u03be\u0005M\u0000\u0000\u03be\u03bf\u0003|>\u0000\u03bf"+
		"\u03c0\u0005\u00be\u0000\u0000\u03c0\u03c1\u0005?\u0000\u0000\u03c1\u03f1"+
		"\u0001\u0000\u0000\u0000\u03c2\u03c3\u0005j\u0000\u0000\u03c3\u03c4\u0005"+
		"M\u0000\u0000\u03c4\u03c5\u0003|>\u0000\u03c5\u03c6\u0005\u00c0\u0000"+
		"\u0000\u03c6\u03f1\u0001\u0000\u0000\u0000\u03c7\u03c8\u0005j\u0000\u0000"+
		"\u03c8\u03c9\u0005M\u0000\u0000\u03c9\u03cb\u0003|>\u0000\u03ca\u03cc"+
		"\u0003\u001e\u000f\u0000\u03cb\u03ca\u0001\u0000\u0000\u0000\u03cb\u03cc"+
		"\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03ce"+
		"\u0005\u00c1\u0000\u0000\u03ce\u03f1\u0001\u0000\u0000\u0000\u03cf\u03d0"+
		"\u0005j\u0000\u0000\u03d0\u03d1\u0005M\u0000\u0000\u03d1\u03d3\u0003|"+
		">\u0000\u03d2\u03d4\u0003\u001e\u000f\u0000\u03d3\u03d2\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000"+
		"\u0000\u03d5\u03d6\u0005\u00c2\u0000\u0000\u03d6\u03f1\u0001\u0000\u0000"+
		"\u0000\u03d7\u03d8\u0005j\u0000\u0000\u03d8\u03d9\u0005M\u0000\u0000\u03d9"+
		"\u03db\u0003|>\u0000\u03da\u03dc\u0003\u001e\u000f\u0000\u03db\u03da\u0001"+
		"\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001"+
		"\u0000\u0000\u0000\u03dd\u03de\u0005p\u0000\u0000\u03de\u03df\u0005\u00bf"+
		"\u0000\u0000\u03df\u03f1\u0001\u0000\u0000\u0000\u03e0\u03e1\u0005j\u0000"+
		"\u0000\u03e1\u03e2\u0005M\u0000\u0000\u03e2\u03e4\u0003|>\u0000\u03e3"+
		"\u03e5\u0003\u001e\u000f\u0000\u03e4\u03e3\u0001\u0000\u0000\u0000\u03e4"+
		"\u03e5\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6"+
		"\u03e7\u0005P\u0000\u0000\u03e7\u03e8\u0005]\u0000\u0000\u03e8\u03f1\u0001"+
		"\u0000\u0000\u0000\u03e9\u03ea\u0005s\u0000\u0000\u03ea\u03f1\u0005t\u0000"+
		"\u0000\u03eb\u03f1\u0005u\u0000\u0000\u03ec\u03f1\u0005v\u0000\u0000\u03ed"+
		"\u03f1\u0005\u00cd\u0000\u0000\u03ee\u03ef\u0005R\u0000\u0000\u03ef\u03f1"+
		"\u0005\u000b\u0000\u0000\u03f0\u0346\u0001\u0000\u0000\u0000\u03f0\u0348"+
		"\u0001\u0000\u0000\u0000\u03f0\u034a\u0001\u0000\u0000\u0000\u03f0\u034e"+
		"\u0001\u0000\u0000\u0000\u03f0\u0352\u0001\u0000\u0000\u0000\u03f0\u0354"+
		"\u0001\u0000\u0000\u0000\u03f0\u0359\u0001\u0000\u0000\u0000\u03f0\u035b"+
		"\u0001\u0000\u0000\u0000\u03f0\u035d\u0001\u0000\u0000\u0000\u03f0\u0360"+
		"\u0001\u0000\u0000\u0000\u03f0\u0362\u0001\u0000\u0000\u0000\u03f0\u0364"+
		"\u0001\u0000\u0000\u0000\u03f0\u0366\u0001\u0000\u0000\u0000\u03f0\u0369"+
		"\u0001\u0000\u0000\u0000\u03f0\u036b\u0001\u0000\u0000\u0000\u03f0\u036d"+
		"\u0001\u0000\u0000\u0000\u03f0\u036f\u0001\u0000\u0000\u0000\u03f0\u0371"+
		"\u0001\u0000\u0000\u0000\u03f0\u0373\u0001\u0000\u0000\u0000\u03f0\u0375"+
		"\u0001\u0000\u0000\u0000\u03f0\u0377\u0001\u0000\u0000\u0000\u03f0\u0379"+
		"\u0001\u0000\u0000\u0000\u03f0\u037b\u0001\u0000\u0000\u0000\u03f0\u037d"+
		"\u0001\u0000\u0000\u0000\u03f0\u0380\u0001\u0000\u0000\u0000\u03f0\u0383"+
		"\u0001\u0000\u0000\u0000\u03f0\u0389\u0001\u0000\u0000\u0000\u03f0\u038f"+
		"\u0001\u0000\u0000\u0000\u03f0\u0395\u0001\u0000\u0000\u0000\u03f0\u039b"+
		"\u0001\u0000\u0000\u0000\u03f0\u03a1\u0001\u0000\u0000\u0000\u03f0\u03a9"+
		"\u0001\u0000\u0000\u0000\u03f0\u03b0\u0001\u0000\u0000\u0000\u03f0\u03b6"+
		"\u0001\u0000\u0000\u0000\u03f0\u03bc\u0001\u0000\u0000\u0000\u03f0\u03c2"+
		"\u0001\u0000\u0000\u0000\u03f0\u03c7\u0001\u0000\u0000\u0000\u03f0\u03cf"+
		"\u0001\u0000\u0000\u0000\u03f0\u03d7\u0001\u0000\u0000\u0000\u03f0\u03e0"+
		"\u0001\u0000\u0000\u0000\u03f0\u03e9\u0001\u0000\u0000\u0000\u03f0\u03eb"+
		"\u0001\u0000\u0000\u0000\u03f0\u03ec\u0001\u0000\u0000\u0000\u03f0\u03ed"+
		"\u0001\u0000\u0000\u0000\u03f0\u03ee\u0001\u0000\u0000\u0000\u03f1\u000f"+
		"\u0001\u0000\u0000\u0000\u03f2\u03f4\u0005L\u0000\u0000\u03f3\u03f5\u0005"+
		"\u00b2\u0000\u0000\u03f4\u03f3\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001"+
		"\u0000\u0000\u0000\u03f5\u03f7\u0001\u0000\u0000\u0000\u03f6\u03f8\u0005"+
		"\u00d4\u0000\u0000\u03f7\u03f6\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001"+
		"\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fd\u0005"+
		"M\u0000\u0000\u03fa\u03fb\u0005|\u0000\u0000\u03fb\u03fc\u0005\u001e\u0000"+
		"\u0000\u03fc\u03fe\u0005 \u0000\u0000\u03fd\u03fa\u0001\u0000\u0000\u0000"+
		"\u03fd\u03fe\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000"+
		"\u03ff\u0400\u0003|>\u0000\u0400\u0011\u0001\u0000\u0000\u0000\u0401\u0402"+
		"\u0005\u00c6\u0000\u0000\u0402\u0403\u0005\u0012\u0000\u0000\u0403\u0407"+
		"\u0003f3\u0000\u0404\u0405\u0005\u00c7\u0000\u0000\u0405\u0406\u0005\u0012"+
		"\u0000\u0000\u0406\u0408\u0003j5\u0000\u0407\u0404\u0001\u0000\u0000\u0000"+
		"\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000"+
		"\u0409\u040a\u0005S\u0000\u0000\u040a\u040b\u0005\u00f3\u0000\u0000\u040b"+
		"\u040c\u0005\u00b7\u0000\u0000\u040c\u0013\u0001\u0000\u0000\u0000\u040d"+
		"\u040e\u0005\u00b8\u0000\u0000\u040e\u040f\u0005\u0012\u0000\u0000\u040f"+
		"\u0410\u0003f3\u0000\u0410\u0413\u0005;\u0000\u0000\u0411\u0414\u0003"+
		"4\u001a\u0000\u0412\u0414\u00036\u001b\u0000\u0413\u0411\u0001\u0000\u0000"+
		"\u0000\u0413\u0412\u0001\u0000\u0000\u0000\u0414\u0418\u0001\u0000\u0000"+
		"\u0000\u0415\u0416\u0005\u00b9\u0000\u0000\u0416\u0417\u0005\r\u0000\u0000"+
		"\u0417\u0419\u0005\u00ba\u0000\u0000\u0418\u0415\u0001\u0000\u0000\u0000"+
		"\u0418\u0419\u0001\u0000\u0000\u0000\u0419\u0015\u0001\u0000\u0000\u0000"+
		"\u041a\u041b\u0005\u00bb\u0000\u0000\u041b\u041c\u0005\u00ee\u0000\u0000"+
		"\u041c\u0017\u0001\u0000\u0000\u0000\u041d\u041f\u0003&\u0013\u0000\u041e"+
		"\u041d\u0001\u0000\u0000\u0000\u041e\u041f\u0001\u0000\u0000\u0000\u041f"+
		"\u0420\u0001\u0000\u0000\u0000\u0420\u0421\u0003@ \u0000\u0421\u0019\u0001"+
		"\u0000\u0000\u0000\u0422\u0423\u0005Q\u0000\u0000\u0423\u0424\u0005\u0098"+
		"\u0000\u0000\u0424\u0425\u0005M\u0000\u0000\u0425\u042c\u0003|>\u0000"+
		"\u0426\u042a\u0003\u001e\u000f\u0000\u0427\u0428\u0005|\u0000\u0000\u0428"+
		"\u0429\u0005\u001e\u0000\u0000\u0429\u042b\u0005 \u0000\u0000\u042a\u0427"+
		"\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000\u0000\u0000\u042b\u042d"+
		"\u0001\u0000\u0000\u0000\u042c\u0426\u0001\u0000\u0000\u0000\u042c\u042d"+
		"\u0001\u0000\u0000\u0000\u042d\u0453\u0001\u0000\u0000\u0000\u042e\u042f"+
		"\u0005Q\u0000\u0000\u042f\u0431\u0005S\u0000\u0000\u0430\u0432\u0005M"+
		"\u0000\u0000\u0431\u0430\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000"+
		"\u0000\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u0435\u0003|>\u0000"+
		"\u0434\u0436\u0003\u001e\u000f\u0000\u0435\u0434\u0001\u0000\u0000\u0000"+
		"\u0435\u0436\u0001\u0000\u0000\u0000\u0436\u0453\u0001\u0000\u0000\u0000"+
		"\u0437\u0438\u0005Q\u0000\u0000\u0438\u043a\u0005\u0098\u0000\u0000\u0439"+
		"\u043b\u0005\u00ea\u0000\u0000\u043a\u0439\u0001\u0000\u0000\u0000\u043a"+
		"\u043b\u0001\u0000\u0000\u0000\u043b\u043c\u0001\u0000\u0000\u0000\u043c"+
		"\u043d\u0005N\u0000\u0000\u043d\u043f\u0005\u00ee\u0000\u0000\u043e\u0440"+
		"\u0003z=\u0000\u043f\u043e\u0001\u0000\u0000\u0000\u043f\u0440\u0001\u0000"+
		"\u0000\u0000\u0440\u0442\u0001\u0000\u0000\u0000\u0441\u0443\u00038\u001c"+
		"\u0000\u0442\u0441\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000"+
		"\u0000\u0443\u0453\u0001\u0000\u0000\u0000\u0444\u0445\u0005Q\u0000\u0000"+
		"\u0445\u0447\u0005\u0098\u0000\u0000\u0446\u0448\u0005\u00ea\u0000\u0000"+
		"\u0447\u0446\u0001\u0000\u0000\u0000\u0447\u0448\u0001\u0000\u0000\u0000"+
		"\u0448\u0449\u0001\u0000\u0000\u0000\u0449\u044b\u0005N\u0000\u0000\u044a"+
		"\u044c\u0005\u00ee\u0000\u0000\u044b\u044a\u0001\u0000\u0000\u0000\u044b"+
		"\u044c\u0001\u0000\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d"+
		"\u0450\u0003*\u0015\u0000\u044e\u044f\u0005\u00b3\u0000\u0000\u044f\u0451"+
		"\u0003,\u0016\u0000\u0450\u044e\u0001\u0000\u0000\u0000\u0450\u0451\u0001"+
		"\u0000\u0000\u0000\u0451\u0453\u0001\u0000\u0000\u0000\u0452\u0422\u0001"+
		"\u0000\u0000\u0000\u0452\u042e\u0001\u0000\u0000\u0000\u0452\u0437\u0001"+
		"\u0000\u0000\u0000\u0452\u0444\u0001\u0000\u0000\u0000\u0453\u001b\u0001"+
		"\u0000\u0000\u0000\u0454\u0456\u0003\u001e\u000f\u0000\u0455\u0457\u0003"+
		"\u0016\u000b\u0000\u0456\u0455\u0001\u0000\u0000\u0000\u0456\u0457\u0001"+
		"\u0000\u0000\u0000\u0457\u001d\u0001\u0000\u0000\u0000\u0458\u0459\u0005"+
		"?\u0000\u0000\u0459\u045a\u0005\u0001\u0000\u0000\u045a\u045f\u0003 \u0010"+
		"\u0000\u045b\u045c\u0005\u0003\u0000\u0000\u045c\u045e\u0003 \u0010\u0000"+
		"\u045d\u045b\u0001\u0000\u0000\u0000\u045e\u0461\u0001\u0000\u0000\u0000"+
		"\u045f\u045d\u0001\u0000\u0000\u0000\u045f\u0460\u0001\u0000\u0000\u0000"+
		"\u0460\u0462\u0001\u0000\u0000\u0000\u0461\u045f\u0001\u0000\u0000\u0000"+
		"\u0462\u0463\u0005\u0002\u0000\u0000\u0463\u001f\u0001\u0000\u0000\u0000"+
		"\u0464\u0467\u0003\u00ba]\u0000\u0465\u0466\u0005~\u0000\u0000\u0466\u0468"+
		"\u0003\u0090H\u0000\u0467\u0465\u0001\u0000\u0000\u0000\u0467\u0468\u0001"+
		"\u0000\u0000\u0000\u0468!\u0001\u0000\u0000\u0000\u0469\u046f\u0003\u00b8"+
		"\\\u0000\u046a\u046f\u0005\u00ee\u0000\u0000\u046b\u046f\u0003\u0092I"+
		"\u0000\u046c\u046f\u0003\u0094J\u0000\u046d\u046f\u0003\u0096K\u0000\u046e"+
		"\u0469\u0001\u0000\u0000\u0000\u046e\u046a\u0001\u0000\u0000\u0000\u046e"+
		"\u046b\u0001\u0000\u0000\u0000\u046e\u046c\u0001\u0000\u0000\u0000\u046e"+
		"\u046d\u0001\u0000\u0000\u0000\u046f#\u0001\u0000\u0000\u0000\u0470\u0475"+
		"\u0003\u00ba]\u0000\u0471\u0472\u0005\u0004\u0000\u0000\u0472\u0474\u0003"+
		"\u00ba]\u0000\u0473\u0471\u0001\u0000\u0000\u0000\u0474\u0477\u0001\u0000"+
		"\u0000\u0000\u0475\u0473\u0001\u0000\u0000\u0000\u0475\u0476\u0001\u0000"+
		"\u0000\u0000\u0476%\u0001\u0000\u0000\u0000\u0477\u0475\u0001\u0000\u0000"+
		"\u0000\u0478\u0479\u0005J\u0000\u0000\u0479\u047e\u0003(\u0014\u0000\u047a"+
		"\u047b\u0005\u0003\u0000\u0000\u047b\u047d\u0003(\u0014\u0000\u047c\u047a"+
		"\u0001\u0000\u0000\u0000\u047d\u0480\u0001\u0000\u0000\u0000\u047e\u047c"+
		"\u0001\u0000\u0000\u0000\u047e\u047f\u0001\u0000\u0000\u0000\u047f\'\u0001"+
		"\u0000\u0000\u0000\u0480\u047e\u0001\u0000\u0000\u0000\u0481\u0483\u0003"+
		"\u00ba]\u0000\u0482\u0484\u0005\r\u0000\u0000\u0483\u0482\u0001\u0000"+
		"\u0000\u0000\u0483\u0484\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000"+
		"\u0000\u0000\u0485\u0486\u0005\u0001\u0000\u0000\u0486\u0487\u0003\u0018"+
		"\f\u0000\u0487\u0488\u0005\u0002\u0000\u0000\u0488)\u0001\u0000\u0000"+
		"\u0000\u0489\u048a\u0005\u009b\u0000\u0000\u048a\u048b\u0003\u00b8\\\u0000"+
		"\u048b+\u0001\u0000\u0000\u0000\u048c\u048d\u0005\u0001\u0000\u0000\u048d"+
		"\u0492\u0003.\u0017\u0000\u048e\u048f\u0005\u0003\u0000\u0000\u048f\u0491"+
		"\u0003.\u0017\u0000\u0490\u048e\u0001\u0000\u0000\u0000\u0491\u0494\u0001"+
		"\u0000\u0000\u0000\u0492\u0490\u0001\u0000\u0000\u0000\u0492\u0493\u0001"+
		"\u0000\u0000\u0000\u0493\u0495\u0001\u0000\u0000\u0000\u0494\u0492\u0001"+
		"\u0000\u0000\u0000\u0495\u0496\u0005\u0002\u0000\u0000\u0496-\u0001\u0000"+
		"\u0000\u0000\u0497\u049c\u00030\u0018\u0000\u0498\u049a\u0005~\u0000\u0000"+
		"\u0499\u0498\u0001\u0000\u0000\u0000\u0499\u049a\u0001\u0000\u0000\u0000"+
		"\u049a\u049b\u0001\u0000\u0000\u0000\u049b\u049d\u00032\u0019\u0000\u049c"+
		"\u0499\u0001\u0000\u0000\u0000\u049c\u049d\u0001\u0000\u0000\u0000\u049d"+
		"/\u0001\u0000\u0000\u0000\u049e\u04a3\u0003\u00ba]\u0000\u049f\u04a0\u0005"+
		"\u0004\u0000\u0000\u04a0\u04a2\u0003\u00ba]\u0000\u04a1\u049f\u0001\u0000"+
		"\u0000\u0000\u04a2\u04a5\u0001\u0000\u0000\u0000\u04a3\u04a1\u0001\u0000"+
		"\u0000\u0000\u04a3\u04a4\u0001\u0000\u0000\u0000\u04a4\u04a8\u0001\u0000"+
		"\u0000\u0000\u04a5\u04a3\u0001\u0000\u0000\u0000\u04a6\u04a8\u0005\u00ee"+
		"\u0000\u0000\u04a7\u049e\u0001\u0000\u0000\u0000\u04a7\u04a6\u0001\u0000"+
		"\u0000\u0000\u04a81\u0001\u0000\u0000\u0000\u04a9\u04ae\u0005\u00f3\u0000"+
		"\u0000\u04aa\u04ae\u0005\u00f4\u0000\u0000\u04ab\u04ae\u0003\u0098L\u0000"+
		"\u04ac\u04ae\u0005\u00ee\u0000\u0000\u04ad\u04a9\u0001\u0000\u0000\u0000"+
		"\u04ad\u04aa\u0001\u0000\u0000\u0000\u04ad\u04ab\u0001\u0000\u0000\u0000"+
		"\u04ad\u04ac\u0001\u0000\u0000\u0000\u04ae3\u0001\u0000\u0000\u0000\u04af"+
		"\u04b0\u0005\u0001\u0000\u0000\u04b0\u04b5\u0003\u0090H\u0000\u04b1\u04b2"+
		"\u0005\u0003\u0000\u0000\u04b2\u04b4\u0003\u0090H\u0000\u04b3\u04b1\u0001"+
		"\u0000\u0000\u0000\u04b4\u04b7\u0001\u0000\u0000\u0000\u04b5\u04b3\u0001"+
		"\u0000\u0000\u0000\u04b5\u04b6\u0001\u0000\u0000\u0000\u04b6\u04b8\u0001"+
		"\u0000\u0000\u0000\u04b7\u04b5\u0001\u0000\u0000\u0000\u04b8\u04b9\u0005"+
		"\u0002\u0000\u0000\u04b95\u0001\u0000\u0000\u0000\u04ba\u04bb\u0005\u0001"+
		"\u0000\u0000\u04bb\u04c0\u00034\u001a\u0000\u04bc\u04bd\u0005\u0003\u0000"+
		"\u0000\u04bd\u04bf\u00034\u001a\u0000\u04be\u04bc\u0001\u0000\u0000\u0000"+
		"\u04bf\u04c2\u0001\u0000\u0000\u0000\u04c0\u04be\u0001\u0000\u0000\u0000"+
		"\u04c0\u04c1\u0001\u0000\u0000\u0000\u04c1\u04c3\u0001\u0000\u0000\u0000"+
		"\u04c2\u04c0\u0001\u0000\u0000\u0000\u04c3\u04c4\u0005\u0002\u0000\u0000"+
		"\u04c47\u0001\u0000\u0000\u0000\u04c5\u04c6\u0005\u00b9\u0000\u0000\u04c6"+
		"\u04c7\u0005\r\u0000\u0000\u04c7\u04cc\u0003:\u001d\u0000\u04c8\u04c9"+
		"\u0005\u00b9\u0000\u0000\u04c9\u04ca\u0005\u0012\u0000\u0000\u04ca\u04cc"+
		"\u0003<\u001e\u0000\u04cb\u04c5\u0001\u0000\u0000\u0000\u04cb\u04c8\u0001"+
		"\u0000\u0000\u0000\u04cc9\u0001\u0000\u0000\u0000\u04cd\u04ce\u0005\u00c9"+
		"\u0000\u0000\u04ce\u04cf\u0005\u00ee\u0000\u0000\u04cf\u04d0\u0005\u00ca"+
		"\u0000\u0000\u04d0\u04d3\u0005\u00ee\u0000\u0000\u04d1\u04d3\u0003\u00ba"+
		"]\u0000\u04d2\u04cd\u0001\u0000\u0000\u0000\u04d2\u04d1\u0001\u0000\u0000"+
		"\u0000\u04d3;\u0001\u0000\u0000\u0000\u04d4\u04d8\u0005\u00ee\u0000\u0000"+
		"\u04d5\u04d6\u0005J\u0000\u0000\u04d6\u04d7\u0005\u009d\u0000\u0000\u04d7"+
		"\u04d9\u0003,\u0016\u0000\u04d8\u04d5\u0001\u0000\u0000\u0000\u04d8\u04d9"+
		"\u0001\u0000\u0000\u0000\u04d9=\u0001\u0000\u0000\u0000\u04da\u04db\u0003"+
		"\u00ba]\u0000\u04db\u04dc\u0005\u00ee\u0000\u0000\u04dc?\u0001\u0000\u0000"+
		"\u0000\u04dd\u04df\u0003\u001a\r\u0000\u04de\u04dd\u0001\u0000\u0000\u0000"+
		"\u04de\u04df\u0001\u0000\u0000\u0000\u04df\u04e0\u0001\u0000\u0000\u0000"+
		"\u04e0\u04e1\u0003F#\u0000\u04e1\u04e2\u0003B!\u0000\u04e2\u04ea\u0001"+
		"\u0000\u0000\u0000\u04e3\u04e5\u0003R)\u0000\u04e4\u04e6\u0003D\"\u0000"+
		"\u04e5\u04e4\u0001\u0000\u0000\u0000\u04e6\u04e7\u0001\u0000\u0000\u0000"+
		"\u04e7\u04e5\u0001\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000"+
		"\u04e8\u04ea\u0001\u0000\u0000\u0000\u04e9\u04de\u0001\u0000\u0000\u0000"+
		"\u04e9\u04e3\u0001\u0000\u0000\u0000\u04eaA\u0001\u0000\u0000\u0000\u04eb"+
		"\u04ec\u0005\u0017\u0000\u0000\u04ec\u04ed\u0005\u0012\u0000\u0000\u04ed"+
		"\u04f2\u0003J%\u0000\u04ee\u04ef\u0005\u0003\u0000\u0000\u04ef\u04f1\u0003"+
		"J%\u0000\u04f0\u04ee\u0001\u0000\u0000\u0000\u04f1\u04f4\u0001\u0000\u0000"+
		"\u0000\u04f2\u04f0\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001\u0000\u0000"+
		"\u0000\u04f3\u04f6\u0001\u0000\u0000\u0000\u04f4\u04f2\u0001\u0000\u0000"+
		"\u0000\u04f5\u04eb\u0001\u0000\u0000\u0000\u04f5\u04f6\u0001\u0000\u0000"+
		"\u0000\u04f6\u0501\u0001\u0000\u0000\u0000\u04f7\u04f8\u0005\u0096\u0000"+
		"\u0000\u04f8\u04f9\u0005\u0012\u0000\u0000\u04f9\u04fe\u0003\u0084B\u0000"+
		"\u04fa\u04fb\u0005\u0003\u0000\u0000\u04fb\u04fd\u0003\u0084B\u0000\u04fc"+
		"\u04fa\u0001\u0000\u0000\u0000\u04fd\u0500\u0001\u0000\u0000\u0000\u04fe"+
		"\u04fc\u0001\u0000\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000\u04ff"+
		"\u0502\u0001\u0000\u0000\u0000\u0500\u04fe\u0001\u0000\u0000\u0000\u0501"+
		"\u04f7\u0001\u0000\u0000\u0000\u0501\u0502\u0001\u0000\u0000\u0000\u0502"+
		"\u050d\u0001\u0000\u0000\u0000\u0503\u0504\u0005\u0097\u0000\u0000\u0504"+
		"\u0505\u0005\u0012\u0000\u0000\u0505\u050a\u0003\u0084B\u0000\u0506\u0507"+
		"\u0005\u0003\u0000\u0000\u0507\u0509\u0003\u0084B\u0000\u0508\u0506\u0001"+
		"\u0000\u0000\u0000\u0509\u050c\u0001\u0000\u0000\u0000\u050a\u0508\u0001"+
		"\u0000\u0000\u0000\u050a\u050b\u0001\u0000\u0000\u0000\u050b\u050e\u0001"+
		"\u0000\u0000\u0000\u050c\u050a\u0001\u0000\u0000\u0000\u050d\u0503\u0001"+
		"\u0000\u0000\u0000\u050d\u050e\u0001\u0000\u0000\u0000\u050e\u0519\u0001"+
		"\u0000\u0000\u0000\u050f\u0510\u0005\u0095\u0000\u0000\u0510\u0511\u0005"+
		"\u0012\u0000\u0000\u0511\u0516\u0003J%\u0000\u0512\u0513\u0005\u0003\u0000"+
		"\u0000\u0513\u0515\u0003J%\u0000\u0514\u0512\u0001\u0000\u0000\u0000\u0515"+
		"\u0518\u0001\u0000\u0000\u0000\u0516\u0514\u0001\u0000\u0000\u0000\u0516"+
		"\u0517\u0001\u0000\u0000\u0000\u0517\u051a\u0001\u0000\u0000\u0000\u0518"+
		"\u0516\u0001\u0000\u0000\u0000\u0519\u050f\u0001\u0000\u0000\u0000\u0519"+
		"\u051a\u0001\u0000\u0000\u0000\u051a\u051c\u0001\u0000\u0000\u0000\u051b"+
		"\u051d\u0003\u00aeW\u0000\u051c\u051b\u0001\u0000\u0000\u0000\u051c\u051d"+
		"\u0001\u0000\u0000\u0000\u051d\u0523\u0001\u0000\u0000\u0000\u051e\u0521"+
		"\u0005\u0019\u0000\u0000\u051f\u0522\u0005\u000e\u0000\u0000\u0520\u0522"+
		"\u0003\u0084B\u0000\u0521\u051f\u0001\u0000\u0000\u0000\u0521\u0520\u0001"+
		"\u0000\u0000\u0000\u0522\u0524\u0001\u0000\u0000\u0000\u0523\u051e\u0001"+
		"\u0000\u0000\u0000\u0523\u0524\u0001\u0000\u0000\u0000\u0524C\u0001\u0000"+
		"\u0000\u0000\u0525\u0527\u0003\u001a\r\u0000\u0526\u0525\u0001\u0000\u0000"+
		"\u0000\u0526\u0527\u0001\u0000\u0000\u0000\u0527\u0528\u0001\u0000\u0000"+
		"\u0000\u0528\u0529\u0003L&\u0000\u0529\u052a\u0003B!\u0000\u052aE\u0001"+
		"\u0000\u0000\u0000\u052b\u052c\u0006#\uffff\uffff\u0000\u052c\u052d\u0003"+
		"H$\u0000\u052d\u0536\u0001\u0000\u0000\u0000\u052e\u052f\n\u0001\u0000"+
		"\u0000\u052f\u0531\u0007\u0007\u0000\u0000\u0530\u0532\u0003Z-\u0000\u0531"+
		"\u0530\u0001\u0000\u0000\u0000\u0531\u0532\u0001\u0000\u0000\u0000\u0532"+
		"\u0533\u0001\u0000\u0000\u0000\u0533\u0535\u0003F#\u0002\u0534\u052e\u0001"+
		"\u0000\u0000\u0000\u0535\u0538\u0001\u0000\u0000\u0000\u0536\u0534\u0001"+
		"\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000\u0000\u0537G\u0001\u0000"+
		"\u0000\u0000\u0538\u0536\u0001\u0000\u0000\u0000\u0539\u0542\u0003L&\u0000"+
		"\u053a\u053b\u0005M\u0000\u0000\u053b\u0542\u0003|>\u0000\u053c\u0542"+
		"\u0003t:\u0000\u053d\u053e\u0005\u0001\u0000\u0000\u053e\u053f\u0003@"+
		" \u0000\u053f\u0540\u0005\u0002\u0000\u0000\u0540\u0542\u0001\u0000\u0000"+
		"\u0000\u0541\u0539\u0001\u0000\u0000\u0000\u0541\u053a\u0001\u0000\u0000"+
		"\u0000\u0541\u053c\u0001\u0000\u0000\u0000\u0541\u053d\u0001\u0000\u0000"+
		"\u0000\u0542I\u0001\u0000\u0000\u0000\u0543\u0545\u0003\u0084B\u0000\u0544"+
		"\u0546\u0007\b\u0000\u0000\u0545\u0544\u0001\u0000\u0000\u0000\u0545\u0546"+
		"\u0001\u0000\u0000\u0000\u0546\u0549\u0001\u0000\u0000\u0000\u0547\u0548"+
		"\u0005(\u0000\u0000\u0548\u054a\u0007\t\u0000\u0000\u0549\u0547\u0001"+
		"\u0000\u0000\u0000\u0549\u054a\u0001\u0000\u0000\u0000\u054aK\u0001\u0000"+
		"\u0000\u0000\u054b\u054c\u0005\n\u0000\u0000\u054c\u054d\u0005\u0099\u0000"+
		"\u0000\u054d\u054e\u0005\u0001\u0000\u0000\u054e\u054f\u0003\u0082A\u0000"+
		"\u054f\u0550\u0005\u0002\u0000\u0000\u0550\u0556\u0001\u0000\u0000\u0000"+
		"\u0551\u0552\u0005m\u0000\u0000\u0552\u0556\u0003\u0082A\u0000\u0553\u0554"+
		"\u0005\u009a\u0000\u0000\u0554\u0556\u0003\u0082A\u0000\u0555\u054b\u0001"+
		"\u0000\u0000\u0000\u0555\u0551\u0001\u0000\u0000\u0000\u0555\u0553\u0001"+
		"\u0000\u0000\u0000\u0556\u0558\u0001\u0000\u0000\u0000\u0557\u0559\u0003"+
		"z=\u0000\u0558\u0557\u0001\u0000\u0000\u0000\u0558\u0559\u0001\u0000\u0000"+
		"\u0000\u0559\u055c\u0001\u0000\u0000\u0000\u055a\u055b\u0005\u009f\u0000"+
		"\u0000\u055b\u055d\u0005\u00ee\u0000\u0000\u055c\u055a\u0001\u0000\u0000"+
		"\u0000\u055c\u055d\u0001\u0000\u0000\u0000\u055d\u055e\u0001\u0000\u0000"+
		"\u0000\u055e\u055f\u0005\u009b\u0000\u0000\u055f\u056c\u0005\u00ee\u0000"+
		"\u0000\u0560\u056a\u0005\r\u0000\u0000\u0561\u056b\u0003h4\u0000\u0562"+
		"\u056b\u0003\u00a4R\u0000\u0563\u0566\u0005\u0001\u0000\u0000\u0564\u0567"+
		"\u0003h4\u0000\u0565\u0567\u0003\u00a4R\u0000\u0566\u0564\u0001\u0000"+
		"\u0000\u0000\u0566\u0565\u0001\u0000\u0000\u0000\u0567\u0568\u0001\u0000"+
		"\u0000\u0000\u0568\u0569\u0005\u0002\u0000\u0000\u0569\u056b\u0001\u0000"+
		"\u0000\u0000\u056a\u0561\u0001\u0000\u0000\u0000\u056a\u0562\u0001\u0000"+
		"\u0000\u0000\u056a\u0563\u0001\u0000\u0000\u0000\u056b\u056d\u0001\u0000"+
		"\u0000\u0000\u056c\u0560\u0001\u0000\u0000\u0000\u056c\u056d\u0001\u0000"+
		"\u0000\u0000\u056d\u056f\u0001\u0000\u0000\u0000\u056e\u0570\u0003z=\u0000"+
		"\u056f\u056e\u0001\u0000\u0000\u0000\u056f\u0570\u0001\u0000\u0000\u0000"+
		"\u0570\u0573\u0001\u0000\u0000\u0000\u0571\u0572\u0005\u009e\u0000\u0000"+
		"\u0572\u0574\u0005\u00ee\u0000\u0000\u0573\u0571\u0001\u0000\u0000\u0000"+
		"\u0573\u0574\u0001\u0000\u0000\u0000\u0574\u0576\u0001\u0000\u0000\u0000"+
		"\u0575\u0577\u0003R)\u0000\u0576\u0575\u0001\u0000\u0000\u0000\u0576\u0577"+
		"\u0001\u0000\u0000\u0000\u0577\u057a\u0001\u0000\u0000\u0000\u0578\u0579"+
		"\u0005\u0010\u0000\u0000\u0579\u057b\u0003\u0086C\u0000\u057a\u0578\u0001"+
		"\u0000\u0000\u0000\u057a\u057b\u0001\u0000\u0000\u0000\u057b\u05a9\u0001"+
		"\u0000\u0000\u0000\u057c\u0580\u0005\n\u0000\u0000\u057d\u057f\u0003N"+
		"\'\u0000\u057e\u057d\u0001\u0000\u0000\u0000\u057f\u0582\u0001\u0000\u0000"+
		"\u0000\u0580\u057e\u0001\u0000\u0000\u0000\u0580\u0581\u0001\u0000\u0000"+
		"\u0000\u0581\u0584\u0001\u0000\u0000\u0000\u0582\u0580\u0001\u0000\u0000"+
		"\u0000\u0583\u0585\u0003Z-\u0000\u0584\u0583\u0001\u0000\u0000\u0000\u0584"+
		"\u0585\u0001\u0000\u0000\u0000\u0585\u0586\u0001\u0000\u0000\u0000\u0586"+
		"\u0588\u0003\u0082A\u0000\u0587\u0589\u0003R)\u0000\u0588\u0587\u0001"+
		"\u0000\u0000\u0000\u0588\u0589\u0001\u0000\u0000\u0000\u0589\u0593\u0001"+
		"\u0000\u0000\u0000\u058a\u0590\u0003R)\u0000\u058b\u058d\u0005\n\u0000"+
		"\u0000\u058c\u058e\u0003Z-\u0000\u058d\u058c\u0001\u0000\u0000\u0000\u058d"+
		"\u058e\u0001\u0000\u0000\u0000\u058e\u058f\u0001\u0000\u0000\u0000\u058f"+
		"\u0591\u0003\u0082A\u0000\u0590\u058b\u0001\u0000\u0000\u0000\u0590\u0591"+
		"\u0001\u0000\u0000\u0000\u0591\u0593\u0001\u0000\u0000\u0000\u0592\u057c"+
		"\u0001\u0000\u0000\u0000\u0592\u058a\u0001\u0000\u0000\u0000\u0593\u0597"+
		"\u0001\u0000\u0000\u0000\u0594\u0596\u0003X,\u0000\u0595\u0594\u0001\u0000"+
		"\u0000\u0000\u0596\u0599\u0001\u0000\u0000\u0000\u0597\u0595\u0001\u0000"+
		"\u0000\u0000\u0597\u0598\u0001\u0000\u0000\u0000\u0598\u059c\u0001\u0000"+
		"\u0000\u0000\u0599\u0597\u0001\u0000\u0000\u0000\u059a\u059b\u0005\u0010"+
		"\u0000\u0000\u059b\u059d\u0003\u0086C\u0000\u059c\u059a\u0001\u0000\u0000"+
		"\u0000\u059c\u059d\u0001\u0000\u0000\u0000\u059d\u059f\u0001\u0000\u0000"+
		"\u0000\u059e\u05a0\u0003T*\u0000\u059f\u059e\u0001\u0000\u0000\u0000\u059f"+
		"\u05a0\u0001\u0000\u0000\u0000\u05a0\u05a3\u0001\u0000\u0000\u0000\u05a1"+
		"\u05a2\u0005\u0018\u0000\u0000\u05a2\u05a4\u0003\u0086C\u0000\u05a3\u05a1"+
		"\u0001\u0000\u0000\u0000\u05a3\u05a4\u0001\u0000\u0000\u0000\u05a4\u05a6"+
		"\u0001\u0000\u0000\u0000\u05a5\u05a7\u0003\u00aeW\u0000\u05a6\u05a5\u0001"+
		"\u0000\u0000\u0000\u05a6\u05a7\u0001\u0000\u0000\u0000\u05a7\u05a9\u0001"+
		"\u0000\u0000\u0000\u05a8\u0555\u0001\u0000\u0000\u0000\u05a8\u0592\u0001"+
		"\u0000\u0000\u0000\u05a9M\u0001\u0000\u0000\u0000\u05aa\u05ab\u0005\u0005"+
		"\u0000\u0000\u05ab\u05b2\u0003P(\u0000\u05ac\u05ae\u0005\u0003\u0000\u0000"+
		"\u05ad\u05ac\u0001\u0000\u0000\u0000\u05ad\u05ae\u0001\u0000\u0000\u0000"+
		"\u05ae\u05af\u0001\u0000\u0000\u0000\u05af\u05b1\u0003P(\u0000\u05b0\u05ad"+
		"\u0001\u0000\u0000\u0000\u05b1\u05b4\u0001\u0000\u0000\u0000\u05b2\u05b0"+
		"\u0001\u0000\u0000\u0000\u05b2\u05b3\u0001\u0000\u0000\u0000\u05b3\u05b5"+
		"\u0001\u0000\u0000\u0000\u05b4\u05b2\u0001\u0000\u0000\u0000\u05b5\u05b6"+
		"\u0005\u0006\u0000\u0000\u05b6O\u0001\u0000\u0000\u0000\u05b7\u05c5\u0003"+
		"\u00ba]\u0000\u05b8\u05b9\u0003\u00ba]\u0000\u05b9\u05ba\u0005\u0001\u0000"+
		"\u0000\u05ba\u05bf\u0003\u008eG\u0000\u05bb\u05bc\u0005\u0003\u0000\u0000"+
		"\u05bc\u05be\u0003\u008eG\u0000\u05bd\u05bb\u0001\u0000\u0000\u0000\u05be"+
		"\u05c1\u0001\u0000\u0000\u0000\u05bf\u05bd\u0001\u0000\u0000\u0000\u05bf"+
		"\u05c0\u0001\u0000\u0000\u0000\u05c0\u05c2\u0001\u0000\u0000\u0000\u05c1"+
		"\u05bf\u0001\u0000\u0000\u0000\u05c2\u05c3\u0005\u0002\u0000\u0000\u05c3"+
		"\u05c5\u0001\u0000\u0000\u0000\u05c4\u05b7\u0001\u0000\u0000\u0000\u05c4"+
		"\u05b8\u0001\u0000\u0000\u0000\u05c5Q\u0001\u0000\u0000\u0000\u05c6\u05c7"+
		"\u0005\u000b\u0000\u0000\u05c7\u05cc\u0003\\.\u0000\u05c8\u05c9\u0005"+
		"\u0003\u0000\u0000\u05c9\u05cb\u0003\\.\u0000\u05ca\u05c8\u0001\u0000"+
		"\u0000\u0000\u05cb\u05ce\u0001\u0000\u0000\u0000\u05cc\u05ca\u0001\u0000"+
		"\u0000\u0000\u05cc\u05cd\u0001\u0000\u0000\u0000\u05cd\u05d2\u0001\u0000"+
		"\u0000\u0000\u05ce\u05cc\u0001\u0000\u0000\u0000\u05cf\u05d1\u0003X,\u0000"+
		"\u05d0\u05cf\u0001\u0000\u0000\u0000\u05d1\u05d4\u0001\u0000\u0000\u0000"+
		"\u05d2\u05d0\u0001\u0000\u0000\u0000\u05d2\u05d3\u0001\u0000\u0000\u0000"+
		"\u05d3S\u0001\u0000\u0000\u0000\u05d4\u05d2\u0001\u0000\u0000\u0000\u05d5"+
		"\u05d6\u0005\u0011\u0000\u0000\u05d6\u05d7\u0005\u0012\u0000\u0000\u05d7"+
		"\u05dc\u0003\u0084B\u0000\u05d8\u05d9\u0005\u0003\u0000\u0000\u05d9\u05db"+
		"\u0003\u0084B\u0000\u05da\u05d8\u0001\u0000\u0000\u0000\u05db\u05de\u0001"+
		"\u0000\u0000\u0000\u05dc\u05da\u0001\u0000\u0000\u0000\u05dc\u05dd\u0001"+
		"\u0000\u0000\u0000\u05dd\u05f0\u0001\u0000\u0000\u0000\u05de\u05dc\u0001"+
		"\u0000\u0000\u0000\u05df\u05e0\u0005J\u0000\u0000\u05e0\u05f1\u0005\u0016"+
		"\u0000\u0000\u05e1\u05e2\u0005J\u0000\u0000\u05e2\u05f1\u0005\u0015\u0000"+
		"\u0000\u05e3\u05e4\u0005\u0013\u0000\u0000\u05e4\u05e5\u0005\u0014\u0000"+
		"\u0000\u05e5\u05e6\u0005\u0001\u0000\u0000\u05e6\u05eb\u0003V+\u0000\u05e7"+
		"\u05e8\u0005\u0003\u0000\u0000\u05e8\u05ea\u0003V+\u0000\u05e9\u05e7\u0001"+
		"\u0000\u0000\u0000\u05ea\u05ed\u0001\u0000\u0000\u0000\u05eb\u05e9\u0001"+
		"\u0000\u0000\u0000\u05eb\u05ec\u0001\u0000\u0000\u0000\u05ec\u05ee\u0001"+
		"\u0000\u0000\u0000\u05ed\u05eb\u0001\u0000\u0000\u0000\u05ee\u05ef\u0005"+
		"\u0002\u0000\u0000\u05ef\u05f1\u0001\u0000\u0000\u0000\u05f0\u05df\u0001"+
		"\u0000\u0000\u0000\u05f0\u05e1\u0001\u0000\u0000\u0000\u05f0\u05e3\u0001"+
		"\u0000\u0000\u0000\u05f0\u05f1\u0001\u0000\u0000\u0000\u05f1U\u0001\u0000"+
		"\u0000\u0000\u05f2\u05fb\u0005\u0001\u0000\u0000\u05f3\u05f8\u0003\u0084"+
		"B\u0000\u05f4\u05f5\u0005\u0003\u0000\u0000\u05f5\u05f7\u0003\u0084B\u0000"+
		"\u05f6\u05f4\u0001\u0000\u0000\u0000\u05f7\u05fa\u0001\u0000\u0000\u0000"+
		"\u05f8\u05f6\u0001\u0000\u0000\u0000\u05f8\u05f9\u0001\u0000\u0000\u0000"+
		"\u05f9\u05fc\u0001\u0000\u0000\u0000\u05fa\u05f8\u0001\u0000\u0000\u0000"+
		"\u05fb\u05f3\u0001\u0000\u0000\u0000\u05fb\u05fc\u0001\u0000\u0000\u0000"+
		"\u05fc\u05fd\u0001\u0000\u0000\u0000\u05fd\u0600\u0005\u0002\u0000\u0000"+
		"\u05fe\u0600\u0003\u0084B\u0000\u05ff\u05f2\u0001\u0000\u0000\u0000\u05ff"+
		"\u05fe\u0001\u0000\u0000\u0000\u0600W\u0001\u0000\u0000\u0000\u0601\u0602"+
		"\u0005<\u0000\u0000\u0602\u0604\u0005O\u0000\u0000\u0603\u0605\u00054"+
		"\u0000\u0000\u0604\u0603\u0001\u0000\u0000\u0000\u0604\u0605\u0001\u0000"+
		"\u0000\u0000\u0605\u0606\u0001\u0000\u0000\u0000\u0606\u0607\u0003\u00b8"+
		"\\\u0000\u0607\u0610\u0005\u0001\u0000\u0000\u0608\u060d\u0003\u0084B"+
		"\u0000\u0609\u060a\u0005\u0003\u0000\u0000\u060a\u060c\u0003\u0084B\u0000"+
		"\u060b\u0609\u0001\u0000\u0000\u0000\u060c\u060f\u0001\u0000\u0000\u0000"+
		"\u060d\u060b\u0001\u0000\u0000\u0000\u060d\u060e\u0001\u0000\u0000\u0000"+
		"\u060e\u0611\u0001\u0000\u0000\u0000\u060f\u060d\u0001\u0000\u0000\u0000"+
		"\u0610\u0608\u0001\u0000\u0000\u0000\u0610\u0611\u0001\u0000\u0000\u0000"+
		"\u0611\u0612\u0001\u0000\u0000\u0000\u0612\u0613\u0005\u0002\u0000\u0000"+
		"\u0613\u061f\u0003\u00ba]\u0000\u0614\u0616\u0005\r\u0000\u0000\u0615"+
		"\u0614\u0001\u0000\u0000\u0000\u0615\u0616\u0001\u0000\u0000\u0000\u0616"+
		"\u0617\u0001\u0000\u0000\u0000\u0617\u061c\u0003\u00ba]\u0000\u0618\u0619"+
		"\u0005\u0003\u0000\u0000\u0619\u061b\u0003\u00ba]\u0000\u061a\u0618\u0001"+
		"\u0000\u0000\u0000\u061b\u061e\u0001\u0000\u0000\u0000\u061c\u061a\u0001"+
		"\u0000\u0000\u0000\u061c\u061d\u0001\u0000\u0000\u0000\u061d\u0620\u0001"+
		"\u0000\u0000\u0000\u061e\u061c\u0001\u0000\u0000\u0000\u061f\u0615\u0001"+
		"\u0000\u0000\u0000\u061f\u0620\u0001\u0000\u0000\u0000\u0620Y\u0001\u0000"+
		"\u0000\u0000\u0621\u0622\u0007\n\u0000\u0000\u0622[\u0001\u0000\u0000"+
		"\u0000\u0623\u0627\u0003r9\u0000\u0624\u0626\u0003^/\u0000\u0625\u0624"+
		"\u0001\u0000\u0000\u0000\u0626\u0629\u0001\u0000\u0000\u0000\u0627\u0625"+
		"\u0001\u0000\u0000\u0000\u0627\u0628\u0001\u0000\u0000\u0000\u0628]\u0001"+
		"\u0000\u0000\u0000\u0629\u0627\u0001\u0000\u0000\u0000\u062a\u062b\u0003"+
		"`0\u0000\u062b\u062c\u00052\u0000\u0000\u062c\u062e\u0003r9\u0000\u062d"+
		"\u062f\u0003b1\u0000\u062e\u062d\u0001\u0000\u0000\u0000\u062e\u062f\u0001"+
		"\u0000\u0000\u0000\u062f\u0636\u0001\u0000\u0000\u0000\u0630\u0631\u0005"+
		":\u0000\u0000\u0631\u0632\u0003`0\u0000\u0632\u0633\u00052\u0000\u0000"+
		"\u0633\u0634\u0003r9\u0000\u0634\u0636\u0001\u0000\u0000\u0000\u0635\u062a"+
		"\u0001\u0000\u0000\u0000\u0635\u0630\u0001\u0000\u0000\u0000\u0636_\u0001"+
		"\u0000\u0000\u0000\u0637\u0639\u00055\u0000\u0000\u0638\u0637\u0001\u0000"+
		"\u0000\u0000\u0638\u0639\u0001\u0000\u0000\u0000\u0639\u064e\u0001\u0000"+
		"\u0000\u0000\u063a\u064e\u00053\u0000\u0000\u063b\u063d\u00056\u0000\u0000"+
		"\u063c\u063e\u00054\u0000\u0000\u063d\u063c\u0001\u0000\u0000\u0000\u063d"+
		"\u063e\u0001\u0000\u0000\u0000\u063e\u064e\u0001\u0000\u0000\u0000\u063f"+
		"\u0640\u00056\u0000\u0000\u0640\u064e\u00057\u0000\u0000\u0641\u0643\u0005"+
		"8\u0000\u0000\u0642\u0644\u00054\u0000\u0000\u0643\u0642\u0001\u0000\u0000"+
		"\u0000\u0643\u0644\u0001\u0000\u0000\u0000\u0644\u064e\u0001\u0000\u0000"+
		"\u0000\u0645\u0647\u00059\u0000\u0000\u0646\u0648\u00054\u0000\u0000\u0647"+
		"\u0646\u0001\u0000\u0000\u0000\u0647\u0648\u0001\u0000\u0000\u0000\u0648"+
		"\u064e\u0001\u0000\u0000\u0000\u0649\u064b\u00056\u0000\u0000\u064a\u0649"+
		"\u0001\u0000\u0000\u0000\u064a\u064b\u0001\u0000\u0000\u0000\u064b\u064c"+
		"\u0001\u0000\u0000\u0000\u064c\u064e\u0005\u00e9\u0000\u0000\u064d\u0638"+
		"\u0001\u0000\u0000\u0000\u064d\u063a\u0001\u0000\u0000\u0000\u064d\u063b"+
		"\u0001\u0000\u0000\u0000\u064d\u063f\u0001\u0000\u0000\u0000\u064d\u0641"+
		"\u0001\u0000\u0000\u0000\u064d\u0645\u0001\u0000\u0000\u0000\u064d\u064a"+
		"\u0001\u0000\u0000\u0000\u064ea\u0001\u0000\u0000\u0000\u064f\u0650\u0005"+
		";\u0000\u0000\u0650\u065e\u0003\u0086C\u0000\u0651\u0652\u0005\u009b\u0000"+
		"\u0000\u0652\u0653\u0005\u0001\u0000\u0000\u0653\u0658\u0003\u00ba]\u0000"+
		"\u0654\u0655\u0005\u0003\u0000\u0000\u0655\u0657\u0003\u00ba]\u0000\u0656"+
		"\u0654\u0001\u0000\u0000\u0000\u0657\u065a\u0001\u0000\u0000\u0000\u0658"+
		"\u0656\u0001\u0000\u0000\u0000\u0658\u0659\u0001\u0000\u0000\u0000\u0659"+
		"\u065b\u0001\u0000\u0000\u0000\u065a\u0658\u0001\u0000\u0000\u0000\u065b"+
		"\u065c\u0005\u0002\u0000\u0000\u065c\u065e\u0001\u0000\u0000\u0000\u065d"+
		"\u064f\u0001\u0000\u0000\u0000\u065d\u0651\u0001\u0000\u0000\u0000\u065e"+
		"c\u0001\u0000\u0000\u0000\u065f\u0660\u0005h\u0000\u0000\u0660\u0679\u0005"+
		"\u0001\u0000\u0000\u0661\u0663\u0005\u0087\u0000\u0000\u0662\u0661\u0001"+
		"\u0000\u0000\u0000\u0662\u0663\u0001\u0000\u0000\u0000\u0663\u0664\u0001"+
		"\u0000\u0000\u0000\u0664\u0665\u0007\u000b\u0000\u0000\u0665\u067a\u0005"+
		"\u0091\u0000\u0000\u0666\u0667\u0003\u0084B\u0000\u0667\u0668\u0005A\u0000"+
		"\u0000\u0668\u067a\u0001\u0000\u0000\u0000\u0669\u067a\u0005\u00f2\u0000"+
		"\u0000\u066a\u066b\u0005\u0092\u0000\u0000\u066b\u066c\u0005\u00f3\u0000"+
		"\u0000\u066c\u066d\u0005\u0093\u0000\u0000\u066d\u066e\u0005\u0094\u0000"+
		"\u0000\u066e\u0677\u0005\u00f3\u0000\u0000\u066f\u0675\u0005;\u0000\u0000"+
		"\u0670\u0676\u0003\u00ba]\u0000\u0671\u0672\u0003\u00b8\\\u0000\u0672"+
		"\u0673\u0005\u0001\u0000\u0000\u0673\u0674\u0005\u0002\u0000\u0000\u0674"+
		"\u0676\u0001\u0000\u0000\u0000\u0675\u0670\u0001\u0000\u0000\u0000\u0675"+
		"\u0671\u0001\u0000\u0000\u0000\u0676\u0678\u0001\u0000\u0000\u0000\u0677"+
		"\u066f\u0001\u0000\u0000\u0000\u0677\u0678\u0001\u0000\u0000\u0000\u0678"+
		"\u067a\u0001\u0000\u0000\u0000\u0679\u0662\u0001\u0000\u0000\u0000\u0679"+
		"\u0666\u0001\u0000\u0000\u0000\u0679\u0669\u0001\u0000\u0000\u0000\u0679"+
		"\u066a\u0001\u0000\u0000\u0000\u067a\u067b\u0001\u0000\u0000\u0000\u067b"+
		"\u067c\u0005\u0002\u0000\u0000\u067ce\u0001\u0000\u0000\u0000\u067d\u067e"+
		"\u0005\u0001\u0000\u0000\u067e\u067f\u0003h4\u0000\u067f\u0680\u0005\u0002"+
		"\u0000\u0000\u0680g\u0001\u0000\u0000\u0000\u0681\u0686\u0003\u00ba]\u0000"+
		"\u0682\u0683\u0005\u0003\u0000\u0000\u0683\u0685\u0003\u00ba]\u0000\u0684"+
		"\u0682\u0001\u0000\u0000\u0000\u0685\u0688\u0001\u0000\u0000\u0000\u0686"+
		"\u0684\u0001\u0000\u0000\u0000\u0686\u0687\u0001\u0000\u0000\u0000\u0687"+
		"i\u0001\u0000\u0000\u0000\u0688\u0686\u0001\u0000\u0000\u0000\u0689\u068a"+
		"\u0005\u0001\u0000\u0000\u068a\u068f\u0003l6\u0000\u068b\u068c\u0005\u0003"+
		"\u0000\u0000\u068c\u068e\u0003l6\u0000\u068d\u068b\u0001\u0000\u0000\u0000"+
		"\u068e\u0691\u0001\u0000\u0000\u0000\u068f\u068d\u0001\u0000\u0000\u0000"+
		"\u068f\u0690\u0001\u0000\u0000\u0000\u0690\u0692\u0001\u0000\u0000\u0000"+
		"\u0691\u068f\u0001\u0000\u0000\u0000\u0692\u0693\u0005\u0002\u0000\u0000"+
		"\u0693k\u0001\u0000\u0000\u0000\u0694\u0696\u0003\u00ba]\u0000\u0695\u0697"+
		"\u0007\b\u0000\u0000\u0696\u0695\u0001\u0000\u0000\u0000\u0696\u0697\u0001"+
		"\u0000\u0000\u0000\u0697m\u0001\u0000\u0000\u0000\u0698\u0699\u0005\u0001"+
		"\u0000\u0000\u0699\u069e\u0003p8\u0000\u069a\u069b\u0005\u0003\u0000\u0000"+
		"\u069b\u069d\u0003p8\u0000\u069c\u069a\u0001\u0000\u0000\u0000\u069d\u06a0"+
		"\u0001\u0000\u0000\u0000\u069e\u069c\u0001\u0000\u0000\u0000\u069e\u069f"+
		"\u0001\u0000\u0000\u0000\u069f\u06a1\u0001\u0000\u0000\u0000\u06a0\u069e"+
		"\u0001\u0000\u0000\u0000\u06a1\u06a2\u0005\u0002\u0000\u0000\u06a2o\u0001"+
		"\u0000\u0000\u0000\u06a3\u06a6\u0003\u00ba]\u0000\u06a4\u06a5\u0005o\u0000"+
		"\u0000\u06a5\u06a7\u0005\u00ee\u0000\u0000\u06a6\u06a4\u0001\u0000\u0000"+
		"\u0000\u06a6\u06a7\u0001\u0000\u0000\u0000\u06a7q\u0001\u0000\u0000\u0000"+
		"\u06a8\u06aa\u0003|>\u0000\u06a9\u06ab\u0003d2\u0000\u06aa\u06a9\u0001"+
		"\u0000\u0000\u0000\u06aa\u06ab\u0001\u0000\u0000\u0000\u06ab\u06ac\u0001"+
		"\u0000\u0000\u0000\u06ac\u06ad\u0003x<\u0000\u06ad\u06c1\u0001\u0000\u0000"+
		"\u0000\u06ae\u06af\u0005\u0001\u0000\u0000\u06af\u06b0\u0003@ \u0000\u06b0"+
		"\u06b2\u0005\u0002\u0000\u0000\u06b1\u06b3\u0003d2\u0000\u06b2\u06b1\u0001"+
		"\u0000\u0000\u0000\u06b2\u06b3\u0001\u0000\u0000\u0000\u06b3\u06b4\u0001"+
		"\u0000\u0000\u0000\u06b4\u06b5\u0003x<\u0000\u06b5\u06c1\u0001\u0000\u0000"+
		"\u0000\u06b6\u06b7\u0005\u0001\u0000\u0000\u06b7\u06b8\u0003\\.\u0000"+
		"\u06b8\u06ba\u0005\u0002\u0000\u0000\u06b9\u06bb\u0003d2\u0000\u06ba\u06b9"+
		"\u0001\u0000\u0000\u0000\u06ba\u06bb\u0001\u0000\u0000\u0000\u06bb\u06bc"+
		"\u0001\u0000\u0000\u0000\u06bc\u06bd\u0003x<\u0000\u06bd\u06c1\u0001\u0000"+
		"\u0000\u0000\u06be\u06c1\u0003t:\u0000\u06bf\u06c1\u0003v;\u0000\u06c0"+
		"\u06a8\u0001\u0000\u0000\u0000\u06c0\u06ae\u0001\u0000\u0000\u0000\u06c0"+
		"\u06b6\u0001\u0000\u0000\u0000\u06c0\u06be\u0001\u0000\u0000\u0000\u06c0"+
		"\u06bf\u0001\u0000\u0000\u0000\u06c1s\u0001\u0000\u0000\u0000\u06c2\u06c3"+
		"\u0005K\u0000\u0000\u06c3\u06c8\u0003\u0084B\u0000\u06c4\u06c5\u0005\u0003"+
		"\u0000\u0000\u06c5\u06c7\u0003\u0084B\u0000\u06c6\u06c4\u0001\u0000\u0000"+
		"\u0000\u06c7\u06ca\u0001\u0000\u0000\u0000\u06c8\u06c6\u0001\u0000\u0000"+
		"\u0000\u06c8\u06c9\u0001\u0000\u0000\u0000\u06c9\u06cb\u0001\u0000\u0000"+
		"\u0000\u06ca\u06c8\u0001\u0000\u0000\u0000\u06cb\u06cc\u0003x<\u0000\u06cc"+
		"u\u0001\u0000\u0000\u0000\u06cd\u06ce\u0003\u00ba]\u0000\u06ce\u06d7\u0005"+
		"\u0001\u0000\u0000\u06cf\u06d4\u0003\u0084B\u0000\u06d0\u06d1\u0005\u0003"+
		"\u0000\u0000\u06d1\u06d3\u0003\u0084B\u0000\u06d2\u06d0\u0001\u0000\u0000"+
		"\u0000\u06d3\u06d6\u0001\u0000\u0000\u0000\u06d4\u06d2\u0001\u0000\u0000"+
		"\u0000\u06d4\u06d5\u0001\u0000\u0000\u0000\u06d5\u06d8\u0001\u0000\u0000"+
		"\u0000\u06d6\u06d4\u0001\u0000\u0000\u0000\u06d7\u06cf\u0001\u0000\u0000"+
		"\u0000\u06d7\u06d8\u0001\u0000\u0000\u0000\u06d8\u06d9\u0001\u0000\u0000"+
		"\u0000\u06d9\u06da\u0005\u0002\u0000\u0000\u06da\u06db\u0003x<\u0000\u06db"+
		"w\u0001\u0000\u0000\u0000\u06dc\u06de\u0005\r\u0000\u0000\u06dd\u06dc"+
		"\u0001\u0000\u0000\u0000\u06dd\u06de\u0001\u0000\u0000\u0000\u06de\u06df"+
		"\u0001\u0000\u0000\u0000\u06df\u06e1\u0003\u00bc^\u0000\u06e0\u06e2\u0003"+
		"f3\u0000\u06e1\u06e0\u0001\u0000\u0000\u0000\u06e1\u06e2\u0001\u0000\u0000"+
		"\u0000\u06e2\u06e4\u0001\u0000\u0000\u0000\u06e3\u06dd\u0001\u0000\u0000"+
		"\u0000\u06e3\u06e4\u0001\u0000\u0000\u0000\u06e4y\u0001\u0000\u0000\u0000"+
		"\u06e5\u06e6\u0005I\u0000\u0000\u06e6\u06e7\u0005V\u0000\u0000\u06e7\u06e8"+
		"\u0005\u009c\u0000\u0000\u06e8\u06ec\u0005\u00ee\u0000\u0000\u06e9\u06ea"+
		"\u0005J\u0000\u0000\u06ea\u06eb\u0005\u009d\u0000\u0000\u06eb\u06ed\u0003"+
		",\u0016\u0000\u06ec\u06e9\u0001\u0000\u0000\u0000\u06ec\u06ed\u0001\u0000"+
		"\u0000\u0000\u06ed\u0717\u0001\u0000\u0000\u0000\u06ee\u06ef\u0005I\u0000"+
		"\u0000\u06ef\u06f0\u0005V\u0000\u0000\u06f0\u06fa\u0005\u00a0\u0000\u0000"+
		"\u06f1\u06f2\u0005\u00a1\u0000\u0000\u06f2\u06f3\u0005\u00a2\u0000\u0000"+
		"\u06f3\u06f4\u0005\u0012\u0000\u0000\u06f4\u06f8\u0005\u00ee\u0000\u0000"+
		"\u06f5\u06f6\u0005\u00a6\u0000\u0000\u06f6\u06f7\u0005\u0012\u0000\u0000"+
		"\u06f7\u06f9\u0005\u00ee\u0000\u0000\u06f8\u06f5\u0001\u0000\u0000\u0000"+
		"\u06f8\u06f9\u0001\u0000\u0000\u0000\u06f9\u06fb\u0001\u0000\u0000\u0000"+
		"\u06fa\u06f1\u0001\u0000\u0000\u0000\u06fa\u06fb\u0001\u0000\u0000\u0000"+
		"\u06fb\u0701\u0001\u0000\u0000\u0000\u06fc\u06fd\u0005\u00a3\u0000\u0000"+
		"\u06fd\u06fe\u0005\u00a4\u0000\u0000\u06fe\u06ff\u0005\u00a2\u0000\u0000"+
		"\u06ff\u0700\u0005\u0012\u0000\u0000\u0700\u0702\u0005\u00ee\u0000\u0000"+
		"\u0701\u06fc\u0001\u0000\u0000\u0000\u0701\u0702\u0001\u0000\u0000\u0000"+
		"\u0702\u0708\u0001\u0000\u0000\u0000\u0703\u0704\u0005m\u0000\u0000\u0704"+
		"\u0705\u0005\u00a5\u0000\u0000\u0705\u0706\u0005\u00a2\u0000\u0000\u0706"+
		"\u0707\u0005\u0012\u0000\u0000\u0707\u0709\u0005\u00ee\u0000\u0000\u0708"+
		"\u0703\u0001\u0000\u0000\u0000\u0708\u0709\u0001\u0000\u0000\u0000\u0709"+
		"\u070e\u0001\u0000\u0000\u0000\u070a\u070b\u0005\u00a7\u0000\u0000\u070b"+
		"\u070c\u0005\u00a2\u0000\u0000\u070c\u070d\u0005\u0012\u0000\u0000\u070d"+
		"\u070f\u0005\u00ee\u0000\u0000\u070e\u070a\u0001\u0000\u0000\u0000\u070e"+
		"\u070f\u0001\u0000\u0000\u0000\u070f\u0714\u0001\u0000\u0000\u0000\u0710"+
		"\u0711\u0005%\u0000\u0000\u0711\u0712\u0005\u00d5\u0000\u0000\u0712\u0713"+
		"\u0005\r\u0000\u0000\u0713\u0715\u0005\u00ee\u0000\u0000\u0714\u0710\u0001"+
		"\u0000\u0000\u0000\u0714\u0715\u0001\u0000\u0000\u0000\u0715\u0717\u0001"+
		"\u0000\u0000\u0000\u0716\u06e5\u0001\u0000\u0000\u0000\u0716\u06ee\u0001"+
		"\u0000\u0000\u0000\u0717{\u0001\u0000\u0000\u0000\u0718\u0719\u0003\u00ba"+
		"]\u0000\u0719\u071a\u0005\u0004\u0000\u0000\u071a\u071c\u0001\u0000\u0000"+
		"\u0000\u071b\u0718\u0001\u0000\u0000\u0000\u071b\u071c\u0001\u0000\u0000"+
		"\u0000\u071c\u071d\u0001\u0000\u0000\u0000\u071d\u071e\u0003\u00ba]\u0000"+
		"\u071e}\u0001\u0000\u0000\u0000\u071f\u0720\u0003\u00ba]\u0000\u0720\u0721"+
		"\u0005\u0004\u0000\u0000\u0721\u0723\u0001\u0000\u0000\u0000\u0722\u071f"+
		"\u0001\u0000\u0000\u0000\u0722\u0723\u0001\u0000\u0000\u0000\u0723\u0724"+
		"\u0001\u0000\u0000\u0000\u0724\u0725\u0003\u00ba]\u0000\u0725\u007f\u0001"+
		"\u0000\u0000\u0000\u0726\u072e\u0003\u0084B\u0000\u0727\u0729\u0005\r"+
		"\u0000\u0000\u0728\u0727\u0001\u0000\u0000\u0000\u0728\u0729\u0001\u0000"+
		"\u0000\u0000\u0729\u072c\u0001\u0000\u0000\u0000\u072a\u072d\u0003\u00ba"+
		"]\u0000\u072b\u072d\u0003f3\u0000\u072c\u072a\u0001\u0000\u0000\u0000"+
		"\u072c\u072b\u0001\u0000\u0000\u0000\u072d\u072f\u0001\u0000\u0000\u0000"+
		"\u072e\u0728\u0001\u0000\u0000\u0000\u072e\u072f\u0001\u0000\u0000\u0000"+
		"\u072f\u0081\u0001\u0000\u0000\u0000\u0730\u0735\u0003\u0080@\u0000\u0731"+
		"\u0732\u0005\u0003\u0000\u0000\u0732\u0734\u0003\u0080@\u0000\u0733\u0731"+
		"\u0001\u0000\u0000\u0000\u0734\u0737\u0001\u0000\u0000\u0000\u0735\u0733"+
		"\u0001\u0000\u0000\u0000\u0735\u0736\u0001\u0000\u0000\u0000\u0736\u0083"+
		"\u0001\u0000\u0000\u0000\u0737\u0735\u0001\u0000\u0000\u0000\u0738\u0739"+
		"\u0003\u0086C\u0000\u0739\u0085\u0001\u0000\u0000\u0000\u073a\u073b\u0006"+
		"C\uffff\uffff\u0000\u073b\u073c\u0005\u001e\u0000\u0000\u073c\u0744\u0003"+
		"\u0086C\u0005\u073d\u073e\u0005 \u0000\u0000\u073e\u073f\u0005\u0001\u0000"+
		"\u0000\u073f\u0740\u0003\u0018\f\u0000\u0740\u0741\u0005\u0002\u0000\u0000"+
		"\u0741\u0744\u0001\u0000\u0000\u0000\u0742\u0744\u0003\u0088D\u0000\u0743"+
		"\u073a\u0001\u0000\u0000\u0000\u0743\u073d\u0001\u0000\u0000\u0000\u0743"+
		"\u0742\u0001\u0000\u0000\u0000\u0744\u074d\u0001\u0000\u0000\u0000\u0745"+
		"\u0746\n\u0002\u0000\u0000\u0746\u0747\u0005\u001c\u0000\u0000\u0747\u074c"+
		"\u0003\u0086C\u0003\u0748\u0749\n\u0001\u0000\u0000\u0749\u074a\u0005"+
		"\u001b\u0000\u0000\u074a\u074c\u0003\u0086C\u0002\u074b\u0745\u0001\u0000"+
		"\u0000\u0000\u074b\u0748\u0001\u0000\u0000\u0000\u074c\u074f\u0001\u0000"+
		"\u0000\u0000\u074d\u074b\u0001\u0000\u0000\u0000\u074d\u074e\u0001\u0000"+
		"\u0000\u0000\u074e\u0087\u0001\u0000\u0000\u0000\u074f\u074d\u0001\u0000"+
		"\u0000\u0000\u0750\u0752\u0003\u008cF\u0000\u0751\u0753\u0003\u008aE\u0000"+
		"\u0752\u0751\u0001\u0000\u0000\u0000\u0752\u0753\u0001\u0000\u0000\u0000"+
		"\u0753\u0089\u0001\u0000\u0000\u0000\u0754\u0756\u0005\u001e\u0000\u0000"+
		"\u0755\u0754\u0001\u0000\u0000\u0000\u0755\u0756\u0001\u0000\u0000\u0000"+
		"\u0756\u0757\u0001\u0000\u0000\u0000\u0757\u0758\u0005!\u0000\u0000\u0758"+
		"\u0759\u0003\u008cF\u0000\u0759\u075a\u0005\u001c\u0000\u0000\u075a\u075b"+
		"\u0003\u008cF\u0000\u075b\u0785\u0001\u0000\u0000\u0000\u075c\u075e\u0005"+
		"\u001e\u0000\u0000\u075d\u075c\u0001\u0000\u0000\u0000\u075d\u075e\u0001"+
		"\u0000\u0000\u0000\u075e\u075f\u0001\u0000\u0000\u0000\u075f\u0760\u0005"+
		"\u001d\u0000\u0000\u0760\u0761\u0005\u0001\u0000\u0000\u0761\u0766\u0003"+
		"\u0084B\u0000\u0762\u0763\u0005\u0003\u0000\u0000\u0763\u0765\u0003\u0084"+
		"B\u0000\u0764\u0762\u0001\u0000\u0000\u0000\u0765\u0768\u0001\u0000\u0000"+
		"\u0000\u0766\u0764\u0001\u0000\u0000\u0000\u0766\u0767\u0001\u0000\u0000"+
		"\u0000\u0767\u0769\u0001\u0000\u0000\u0000\u0768\u0766\u0001\u0000\u0000"+
		"\u0000\u0769\u076a\u0005\u0002\u0000\u0000\u076a\u0785\u0001\u0000\u0000"+
		"\u0000\u076b\u076d\u0005\u001e\u0000\u0000\u076c\u076b\u0001\u0000\u0000"+
		"\u0000\u076c\u076d\u0001\u0000\u0000\u0000\u076d\u076e\u0001\u0000\u0000"+
		"\u0000\u076e\u076f\u0005\u001d\u0000\u0000\u076f\u0770\u0005\u0001\u0000"+
		"\u0000\u0770\u0771\u0003\u0018\f\u0000\u0771\u0772\u0005\u0002\u0000\u0000"+
		"\u0772\u0785\u0001\u0000\u0000\u0000\u0773\u0775\u0005\u001e\u0000\u0000"+
		"\u0774\u0773\u0001\u0000\u0000\u0000\u0774\u0775\u0001\u0000\u0000\u0000"+
		"\u0775\u0776\u0001\u0000\u0000\u0000\u0776\u0777\u0007\f\u0000\u0000\u0777"+
		"\u0785\u0003\u008cF\u0000\u0778\u077a\u0005$\u0000\u0000\u0779\u077b\u0005"+
		"\u001e\u0000\u0000\u077a\u0779\u0001\u0000\u0000\u0000\u077a\u077b\u0001"+
		"\u0000\u0000\u0000\u077b\u077c\u0001\u0000\u0000\u0000\u077c\u0785\u0005"+
		"%\u0000\u0000\u077d\u077f\u0005$\u0000\u0000\u077e\u0780\u0005\u001e\u0000"+
		"\u0000\u077f\u077e\u0001\u0000\u0000\u0000\u077f\u0780\u0001\u0000\u0000"+
		"\u0000\u0780\u0781\u0001\u0000\u0000\u0000\u0781\u0782\u0005\u000f\u0000"+
		"\u0000\u0782\u0783\u0005\u000b\u0000\u0000\u0783\u0785\u0003\u008cF\u0000"+
		"\u0784\u0755\u0001\u0000\u0000\u0000\u0784\u075d\u0001\u0000\u0000\u0000"+
		"\u0784\u076c\u0001\u0000\u0000\u0000\u0784\u0774\u0001\u0000\u0000\u0000"+
		"\u0784\u0778\u0001\u0000\u0000\u0000\u0784\u077d\u0001\u0000\u0000\u0000"+
		"\u0785\u008b\u0001\u0000\u0000\u0000\u0786\u0787\u0006F\uffff\uffff\u0000"+
		"\u0787\u078b\u0003\u008eG\u0000\u0788\u0789\u0007\r\u0000\u0000\u0789"+
		"\u078b\u0003\u008cF\u0007\u078a\u0786\u0001\u0000\u0000\u0000\u078a\u0788"+
		"\u0001\u0000\u0000\u0000\u078b\u07a1\u0001\u0000\u0000\u0000\u078c\u078d"+
		"\n\u0006\u0000\u0000\u078d\u078e\u0007\u000e\u0000\u0000\u078e\u07a0\u0003"+
		"\u008cF\u0007\u078f\u0790\n\u0005\u0000\u0000\u0790\u0791\u0007\u000f"+
		"\u0000\u0000\u0791\u07a0\u0003\u008cF\u0006\u0792\u0793\n\u0004\u0000"+
		"\u0000\u0793\u0794\u0005\u008d\u0000\u0000\u0794\u07a0\u0003\u008cF\u0005"+
		"\u0795\u0796\n\u0003\u0000\u0000\u0796\u0797\u0005\u0090\u0000\u0000\u0797"+
		"\u07a0\u0003\u008cF\u0004\u0798\u0799\n\u0002\u0000\u0000\u0799\u079a"+
		"\u0005\u008e\u0000\u0000\u079a\u07a0\u0003\u008cF\u0003\u079b\u079c\n"+
		"\u0001\u0000\u0000\u079c\u079d\u0003\u0092I\u0000\u079d\u079e\u0003\u008c"+
		"F\u0002\u079e\u07a0\u0001\u0000\u0000\u0000\u079f\u078c\u0001\u0000\u0000"+
		"\u0000\u079f\u078f\u0001\u0000\u0000\u0000\u079f\u0792\u0001\u0000\u0000"+
		"\u0000\u079f\u0795\u0001\u0000\u0000\u0000\u079f\u0798\u0001\u0000\u0000"+
		"\u0000\u079f\u079b\u0001\u0000\u0000\u0000\u07a0\u07a3\u0001\u0000\u0000"+
		"\u0000\u07a1\u079f\u0001\u0000\u0000\u0000\u07a1\u07a2\u0001\u0000\u0000"+
		"\u0000\u07a2\u008d\u0001\u0000\u0000\u0000\u07a3\u07a1\u0001\u0000\u0000"+
		"\u0000\u07a4\u07a5\u0006G\uffff\uffff\u0000\u07a5\u0822\u0007\u0010\u0000"+
		"\u0000\u07a6\u07a8\u0005-\u0000\u0000\u07a7\u07a9\u0003\u00acV\u0000\u07a8"+
		"\u07a7\u0001\u0000\u0000\u0000\u07a9\u07aa\u0001\u0000\u0000\u0000\u07aa"+
		"\u07a8\u0001\u0000\u0000\u0000\u07aa\u07ab\u0001\u0000\u0000\u0000\u07ab"+
		"\u07ae\u0001\u0000\u0000\u0000\u07ac\u07ad\u00050\u0000\u0000\u07ad\u07af"+
		"\u0003\u0084B\u0000\u07ae\u07ac\u0001\u0000\u0000\u0000\u07ae\u07af\u0001"+
		"\u0000\u0000\u0000\u07af\u07b0\u0001\u0000\u0000\u0000\u07b0\u07b1\u0005"+
		"1\u0000\u0000\u07b1\u0822\u0001\u0000\u0000\u0000\u07b2\u07b3\u0005-\u0000"+
		"\u0000\u07b3\u07b5\u0003\u0084B\u0000\u07b4\u07b6\u0003\u00acV\u0000\u07b5"+
		"\u07b4\u0001\u0000\u0000\u0000\u07b6\u07b7\u0001\u0000\u0000\u0000\u07b7"+
		"\u07b5\u0001\u0000\u0000\u0000\u07b7\u07b8\u0001\u0000\u0000\u0000\u07b8"+
		"\u07bb\u0001\u0000\u0000\u0000\u07b9\u07ba\u00050\u0000\u0000\u07ba\u07bc"+
		"\u0003\u0084B\u0000\u07bb\u07b9\u0001\u0000\u0000\u0000\u07bb\u07bc\u0001"+
		"\u0000\u0000\u0000\u07bc\u07bd\u0001\u0000\u0000\u0000\u07bd\u07be\u0005"+
		"1\u0000\u0000\u07be\u0822\u0001\u0000\u0000\u0000\u07bf\u07c0\u0005Z\u0000"+
		"\u0000\u07c0\u07c1\u0005\u0001\u0000\u0000\u07c1\u07c2\u0003\u0084B\u0000"+
		"\u07c2\u07c3\u0005\r\u0000\u0000\u07c3\u07c4\u0003\u00a2Q\u0000\u07c4"+
		"\u07c5\u0005\u0002\u0000\u0000\u07c5\u0822\u0001\u0000\u0000\u0000\u07c6"+
		"\u07c7\u0005n\u0000\u0000\u07c7\u07d0\u0005\u0001\u0000\u0000\u07c8\u07cd"+
		"\u0003\u0080@\u0000\u07c9\u07ca\u0005\u0003\u0000\u0000\u07ca\u07cc\u0003"+
		"\u0080@\u0000\u07cb\u07c9\u0001\u0000\u0000\u0000\u07cc\u07cf\u0001\u0000"+
		"\u0000\u0000\u07cd\u07cb\u0001\u0000\u0000\u0000\u07cd\u07ce\u0001\u0000"+
		"\u0000\u0000\u07ce\u07d1\u0001\u0000\u0000\u0000\u07cf\u07cd\u0001\u0000"+
		"\u0000\u0000\u07d0\u07c8\u0001\u0000\u0000\u0000\u07d0\u07d1\u0001\u0000"+
		"\u0000\u0000\u07d1\u07d2\u0001\u0000\u0000\u0000\u07d2\u0822\u0005\u0002"+
		"\u0000\u0000\u07d3\u07d4\u0005F\u0000\u0000\u07d4\u07d5\u0005\u0001\u0000"+
		"\u0000\u07d5\u07d8\u0003\u0084B\u0000\u07d6\u07d7\u0005x\u0000\u0000\u07d7"+
		"\u07d9\u0005(\u0000\u0000\u07d8\u07d6\u0001\u0000\u0000\u0000\u07d8\u07d9"+
		"\u0001\u0000\u0000\u0000\u07d9\u07da\u0001\u0000\u0000\u0000\u07da\u07db"+
		"\u0005\u0002\u0000\u0000\u07db\u0822\u0001\u0000\u0000\u0000\u07dc\u07dd"+
		"\u0005H\u0000\u0000\u07dd\u07de\u0005\u0001\u0000\u0000\u07de\u07e1\u0003"+
		"\u0084B\u0000\u07df\u07e0\u0005x\u0000\u0000\u07e0\u07e2\u0005(\u0000"+
		"\u0000\u07e1\u07df\u0001\u0000\u0000\u0000\u07e1\u07e2\u0001\u0000\u0000"+
		"\u0000\u07e2\u07e3\u0001\u0000\u0000\u0000\u07e3\u07e4\u0005\u0002\u0000"+
		"\u0000\u07e4\u0822\u0001\u0000\u0000\u0000\u07e5\u07e6\u0005}\u0000\u0000"+
		"\u07e6\u07e7\u0005\u0001\u0000\u0000\u07e7\u07e8\u0003\u008cF\u0000\u07e8"+
		"\u07e9\u0005\u001d\u0000\u0000\u07e9\u07ea\u0003\u008cF\u0000\u07ea\u07eb"+
		"\u0005\u0002\u0000\u0000\u07eb\u0822\u0001\u0000\u0000\u0000\u07ec\u0822"+
		"\u0003\u0090H\u0000\u07ed\u0822\u0005\u0088\u0000\u0000\u07ee\u07ef\u0003"+
		"\u00b8\\\u0000\u07ef\u07f0\u0005\u0004\u0000\u0000\u07f0\u07f1\u0005\u0088"+
		"\u0000\u0000\u07f1\u0822\u0001\u0000\u0000\u0000\u07f2\u07f3\u0005\u0001"+
		"\u0000\u0000\u07f3\u07f6\u0003\u0080@\u0000\u07f4\u07f5\u0005\u0003\u0000"+
		"\u0000\u07f5\u07f7\u0003\u0080@\u0000\u07f6\u07f4\u0001\u0000\u0000\u0000"+
		"\u07f7\u07f8\u0001\u0000\u0000\u0000\u07f8\u07f6\u0001\u0000\u0000\u0000"+
		"\u07f8\u07f9\u0001\u0000\u0000\u0000\u07f9\u07fa\u0001\u0000\u0000\u0000"+
		"\u07fa\u07fb\u0005\u0002\u0000\u0000\u07fb\u0822\u0001\u0000\u0000\u0000"+
		"\u07fc\u07fd\u0005\u0001\u0000\u0000\u07fd\u07fe\u0003\u0018\f\u0000\u07fe"+
		"\u07ff\u0005\u0002\u0000\u0000\u07ff\u0822\u0001\u0000\u0000\u0000\u0800"+
		"\u0801\u0003\u00b8\\\u0000\u0801\u080d\u0005\u0001\u0000\u0000\u0802\u0804"+
		"\u0003Z-\u0000\u0803\u0802\u0001\u0000\u0000\u0000\u0803\u0804\u0001\u0000"+
		"\u0000\u0000\u0804\u0805\u0001\u0000\u0000\u0000\u0805\u080a\u0003\u0084"+
		"B\u0000\u0806\u0807\u0005\u0003\u0000\u0000\u0807\u0809\u0003\u0084B\u0000"+
		"\u0808\u0806\u0001\u0000\u0000\u0000\u0809\u080c\u0001\u0000\u0000\u0000"+
		"\u080a\u0808\u0001\u0000\u0000\u0000\u080a\u080b\u0001\u0000\u0000\u0000"+
		"\u080b\u080e\u0001\u0000\u0000\u0000\u080c\u080a\u0001\u0000\u0000\u0000"+
		"\u080d\u0803\u0001\u0000\u0000\u0000\u080d\u080e\u0001\u0000\u0000\u0000"+
		"\u080e\u080f\u0001\u0000\u0000\u0000\u080f\u0812\u0005\u0002\u0000\u0000"+
		"\u0810\u0811\u0005>\u0000\u0000\u0811\u0813\u0003\u00b2Y\u0000\u0812\u0810"+
		"\u0001\u0000\u0000\u0000\u0812\u0813\u0001\u0000\u0000\u0000\u0813\u0822"+
		"\u0001\u0000\u0000\u0000\u0814\u0815\u0003\u00b8\\\u0000\u0815\u0816\u0005"+
		"\u0001\u0000\u0000\u0816\u0817\u0007\u0011\u0000\u0000\u0817\u0818\u0003"+
		"\u0084B\u0000\u0818\u0819\u0005\u000b\u0000\u0000\u0819\u081a\u0003\u0084"+
		"B\u0000\u081a\u081b\u0005\u0002\u0000\u0000\u081b\u0822\u0001\u0000\u0000"+
		"\u0000\u081c\u0822\u0003\u00ba]\u0000\u081d\u081e\u0005\u0001\u0000\u0000"+
		"\u081e\u081f\u0003\u0084B\u0000\u081f\u0820\u0005\u0002\u0000\u0000\u0820"+
		"\u0822\u0001\u0000\u0000\u0000\u0821\u07a4\u0001\u0000\u0000\u0000\u0821"+
		"\u07a6\u0001\u0000\u0000\u0000\u0821\u07b2\u0001\u0000\u0000\u0000\u0821"+
		"\u07bf\u0001\u0000\u0000\u0000\u0821\u07c6\u0001\u0000\u0000\u0000\u0821"+
		"\u07d3\u0001\u0000\u0000\u0000\u0821\u07dc\u0001\u0000\u0000\u0000\u0821"+
		"\u07e5\u0001\u0000\u0000\u0000\u0821\u07ec\u0001\u0000\u0000\u0000\u0821"+
		"\u07ed\u0001\u0000\u0000\u0000\u0821\u07ee\u0001\u0000\u0000\u0000\u0821"+
		"\u07f2\u0001\u0000\u0000\u0000\u0821\u07fc\u0001\u0000\u0000\u0000\u0821"+
		"\u0800\u0001\u0000\u0000\u0000\u0821\u0814\u0001\u0000\u0000\u0000\u0821"+
		"\u081c\u0001\u0000\u0000\u0000\u0821\u081d\u0001\u0000\u0000\u0000\u0822"+
		"\u082d\u0001\u0000\u0000\u0000\u0823\u0824\n\u0004\u0000\u0000\u0824\u0825"+
		"\u0005\u0007\u0000\u0000\u0825\u0826\u0003\u008cF\u0000\u0826\u0827\u0005"+
		"\b\u0000\u0000\u0827\u082c\u0001\u0000\u0000\u0000\u0828\u0829\n\u0002"+
		"\u0000\u0000\u0829\u082a\u0005\u0004\u0000\u0000\u082a\u082c\u0003\u00ba"+
		"]\u0000\u082b\u0823\u0001\u0000\u0000\u0000\u082b\u0828\u0001\u0000\u0000"+
		"\u0000\u082c\u082f\u0001\u0000\u0000\u0000\u082d\u082b\u0001\u0000\u0000"+
		"\u0000\u082d\u082e\u0001\u0000\u0000\u0000\u082e\u008f\u0001\u0000\u0000"+
		"\u0000\u082f\u082d\u0001\u0000\u0000\u0000\u0830\u083d\u0005%\u0000\u0000"+
		"\u0831\u083d\u0003\u009aM\u0000\u0832\u0833\u0003\u00ba]\u0000\u0833\u0834"+
		"\u0005\u00ee\u0000\u0000\u0834\u083d\u0001\u0000\u0000\u0000\u0835\u083d"+
		"\u0003\u00c0`\u0000\u0836\u083d\u0003\u0098L\u0000\u0837\u0839\u0005\u00ee"+
		"\u0000\u0000\u0838\u0837\u0001\u0000\u0000\u0000\u0839\u083a\u0001\u0000"+
		"\u0000\u0000\u083a\u0838\u0001\u0000\u0000\u0000\u083a\u083b\u0001\u0000"+
		"\u0000\u0000\u083b\u083d\u0001\u0000\u0000\u0000\u083c\u0830\u0001\u0000"+
		"\u0000\u0000\u083c\u0831\u0001\u0000\u0000\u0000\u083c\u0832\u0001\u0000"+
		"\u0000\u0000\u083c\u0835\u0001\u0000\u0000\u0000\u083c\u0836\u0001\u0000"+
		"\u0000\u0000\u083c\u0838\u0001\u0000\u0000\u0000\u083d\u0091\u0001\u0000"+
		"\u0000\u0000\u083e\u083f\u0007\u0012\u0000\u0000\u083f\u0093\u0001\u0000"+
		"\u0000\u0000\u0840\u0841\u0007\u0013\u0000\u0000\u0841\u0095\u0001\u0000"+
		"\u0000\u0000\u0842\u0843\u0007\u0014\u0000\u0000\u0843\u0097\u0001\u0000"+
		"\u0000\u0000\u0844\u0845\u0007\u0015\u0000\u0000\u0845\u0099\u0001\u0000"+
		"\u0000\u0000\u0846\u084a\u0005,\u0000\u0000\u0847\u0849\u0003\u009cN\u0000"+
		"\u0848\u0847\u0001\u0000\u0000\u0000\u0849\u084c\u0001\u0000\u0000\u0000"+
		"\u084a\u0848\u0001\u0000\u0000\u0000\u084a\u084b\u0001\u0000\u0000\u0000"+
		"\u084b\u009b\u0001\u0000\u0000\u0000\u084c\u084a\u0001\u0000\u0000\u0000"+
		"\u084d\u084e\u0003\u009eO\u0000\u084e\u0851\u0003\u00ba]\u0000\u084f\u0850"+
		"\u0005g\u0000\u0000\u0850\u0852\u0003\u00ba]\u0000\u0851\u084f\u0001\u0000"+
		"\u0000\u0000\u0851\u0852\u0001\u0000\u0000\u0000\u0852\u009d\u0001\u0000"+
		"\u0000\u0000\u0853\u0855\u0007\u0016\u0000\u0000\u0854\u0853\u0001\u0000"+
		"\u0000\u0000\u0854\u0855\u0001\u0000\u0000\u0000\u0855\u0856\u0001\u0000"+
		"\u0000\u0000\u0856\u0859\u0007\u000b\u0000\u0000\u0857\u0859\u0005\u00ee"+
		"\u0000\u0000\u0858\u0854\u0001\u0000\u0000\u0000\u0858\u0857\u0001\u0000"+
		"\u0000\u0000\u0859\u009f\u0001\u0000\u0000\u0000\u085a\u085e\u0005F\u0000"+
		"\u0000\u085b\u085c\u0005G\u0000\u0000\u085c\u085e\u0003\u00ba]\u0000\u085d"+
		"\u085a\u0001\u0000\u0000\u0000\u085d\u085b\u0001\u0000\u0000\u0000\u085e"+
		"\u00a1\u0001\u0000\u0000\u0000\u085f\u0860\u0005l\u0000\u0000\u0860\u0861"+
		"\u0005\u0082\u0000\u0000\u0861\u0862\u0003\u00a2Q\u0000\u0862\u0863\u0005"+
		"\u0084\u0000\u0000\u0863\u0882\u0001\u0000\u0000\u0000\u0864\u0865\u0005"+
		"m\u0000\u0000\u0865\u0866\u0005\u0082\u0000\u0000\u0866\u0867\u0003\u00a2"+
		"Q\u0000\u0867\u0868\u0005\u0003\u0000\u0000\u0868\u0869\u0003\u00a2Q\u0000"+
		"\u0869\u086a\u0005\u0084\u0000\u0000\u086a\u0882\u0001\u0000\u0000\u0000"+
		"\u086b\u0872\u0005n\u0000\u0000\u086c\u086e\u0005\u0082\u0000\u0000\u086d"+
		"\u086f\u0003\u00a8T\u0000\u086e\u086d\u0001\u0000\u0000\u0000\u086e\u086f"+
		"\u0001\u0000\u0000\u0000\u086f\u0870\u0001\u0000\u0000\u0000\u0870\u0873"+
		"\u0005\u0084\u0000\u0000\u0871\u0873\u0005\u0080\u0000\u0000\u0872\u086c"+
		"\u0001\u0000\u0000\u0000\u0872\u0871\u0001\u0000\u0000\u0000\u0873\u0882"+
		"\u0001\u0000\u0000\u0000\u0874\u087f\u0003\u00ba]\u0000\u0875\u0876\u0005"+
		"\u0001\u0000\u0000\u0876\u087b\u0005\u00f3\u0000\u0000\u0877\u0878\u0005"+
		"\u0003\u0000\u0000\u0878\u087a\u0005\u00f3\u0000\u0000\u0879\u0877\u0001"+
		"\u0000\u0000\u0000\u087a\u087d\u0001\u0000\u0000\u0000\u087b\u0879\u0001"+
		"\u0000\u0000\u0000\u087b\u087c\u0001\u0000\u0000\u0000\u087c\u087e\u0001"+
		"\u0000\u0000\u0000\u087d\u087b\u0001\u0000\u0000\u0000\u087e\u0880\u0005"+
		"\u0002\u0000\u0000\u087f\u0875\u0001\u0000\u0000\u0000\u087f\u0880\u0001"+
		"\u0000\u0000\u0000\u0880\u0882\u0001\u0000\u0000\u0000\u0881\u085f\u0001"+
		"\u0000\u0000\u0000\u0881\u0864\u0001\u0000\u0000\u0000\u0881\u086b\u0001"+
		"\u0000\u0000\u0000\u0881\u0874\u0001\u0000\u0000\u0000\u0882\u00a3\u0001"+
		"\u0000\u0000\u0000\u0883\u0888\u0003\u00a6S\u0000\u0884\u0885\u0005\u0003"+
		"\u0000\u0000\u0885\u0887\u0003\u00a6S\u0000\u0886\u0884\u0001\u0000\u0000"+
		"\u0000\u0887\u088a\u0001\u0000\u0000\u0000\u0888\u0886\u0001\u0000\u0000"+
		"\u0000\u0888\u0889\u0001\u0000\u0000\u0000\u0889\u00a5\u0001\u0000\u0000"+
		"\u0000\u088a\u0888\u0001\u0000\u0000\u0000\u088b\u088c\u0003\u00ba]\u0000"+
		"\u088c\u088f\u0003\u00a2Q\u0000\u088d\u088e\u0005o\u0000\u0000\u088e\u0890"+
		"\u0005\u00ee\u0000\u0000\u088f\u088d\u0001\u0000\u0000\u0000\u088f\u0890"+
		"\u0001\u0000\u0000\u0000\u0890\u00a7\u0001\u0000\u0000\u0000\u0891\u0896"+
		"\u0003\u00aaU\u0000\u0892\u0893\u0005\u0003\u0000\u0000\u0893\u0895\u0003"+
		"\u00aaU\u0000\u0894\u0892\u0001\u0000\u0000\u0000\u0895\u0898\u0001\u0000"+
		"\u0000\u0000\u0896\u0894\u0001\u0000\u0000\u0000\u0896\u0897\u0001\u0000"+
		"\u0000\u0000\u0897\u00a9\u0001\u0000\u0000\u0000\u0898\u0896\u0001\u0000"+
		"\u0000\u0000\u0899\u089a\u0003\u00ba]\u0000\u089a\u089b\u0005\t\u0000"+
		"\u0000\u089b\u089e\u0003\u00a2Q\u0000\u089c\u089d\u0005o\u0000\u0000\u089d"+
		"\u089f\u0005\u00ee\u0000\u0000\u089e\u089c\u0001\u0000\u0000\u0000\u089e"+
		"\u089f\u0001\u0000\u0000\u0000\u089f\u00ab\u0001\u0000\u0000\u0000\u08a0"+
		"\u08a1\u0005.\u0000\u0000\u08a1\u08a2\u0003\u0084B\u0000\u08a2\u08a3\u0005"+
		"/\u0000\u0000\u08a3\u08a4\u0003\u0084B\u0000\u08a4\u00ad\u0001\u0000\u0000"+
		"\u0000\u08a5\u08a6\u0005=\u0000\u0000\u08a6\u08ab\u0003\u00b0X\u0000\u08a7"+
		"\u08a8\u0005\u0003\u0000\u0000\u08a8\u08aa\u0003\u00b0X\u0000\u08a9\u08a7"+
		"\u0001\u0000\u0000\u0000\u08aa\u08ad\u0001\u0000\u0000\u0000\u08ab\u08a9"+
		"\u0001\u0000\u0000\u0000\u08ab\u08ac\u0001\u0000\u0000\u0000\u08ac\u00af"+
		"\u0001\u0000\u0000\u0000\u08ad\u08ab\u0001\u0000\u0000\u0000\u08ae\u08af"+
		"\u0003\u00ba]\u0000\u08af\u08b0\u0005\r\u0000\u0000\u08b0\u08b1\u0003"+
		"\u00b2Y\u0000\u08b1\u00b1\u0001\u0000\u0000\u0000\u08b2\u08dd\u0003\u00ba"+
		"]\u0000\u08b3\u08d6\u0005\u0001\u0000\u0000\u08b4\u08b5\u0005\u0096\u0000"+
		"\u0000\u08b5\u08b6\u0005\u0012\u0000\u0000\u08b6\u08bb\u0003\u0084B\u0000"+
		"\u08b7\u08b8\u0005\u0003\u0000\u0000\u08b8\u08ba\u0003\u0084B\u0000\u08b9"+
		"\u08b7\u0001\u0000\u0000\u0000\u08ba\u08bd\u0001\u0000\u0000\u0000\u08bb"+
		"\u08b9\u0001\u0000\u0000\u0000\u08bb\u08bc\u0001\u0000\u0000\u0000\u08bc"+
		"\u08d7\u0001\u0000\u0000\u0000\u08bd\u08bb\u0001\u0000\u0000\u0000\u08be"+
		"\u08bf\u0007\u0017\u0000\u0000\u08bf\u08c0\u0005\u0012\u0000\u0000\u08c0"+
		"\u08c5\u0003\u0084B\u0000\u08c1\u08c2\u0005\u0003\u0000\u0000\u08c2\u08c4"+
		"\u0003\u0084B\u0000\u08c3\u08c1\u0001\u0000\u0000\u0000\u08c4\u08c7\u0001"+
		"\u0000\u0000\u0000\u08c5\u08c3\u0001\u0000\u0000\u0000\u08c5\u08c6\u0001"+
		"\u0000\u0000\u0000\u08c6\u08c9\u0001\u0000\u0000\u0000\u08c7\u08c5\u0001"+
		"\u0000\u0000\u0000\u08c8\u08be\u0001\u0000\u0000\u0000\u08c8\u08c9\u0001"+
		"\u0000\u0000\u0000\u08c9\u08d4\u0001\u0000\u0000\u0000\u08ca\u08cb\u0007"+
		"\u0018\u0000\u0000\u08cb\u08cc\u0005\u0012\u0000\u0000\u08cc\u08d1\u0003"+
		"J%\u0000\u08cd\u08ce\u0005\u0003\u0000\u0000\u08ce\u08d0\u0003J%\u0000"+
		"\u08cf\u08cd\u0001\u0000\u0000\u0000\u08d0\u08d3\u0001\u0000\u0000\u0000"+
		"\u08d1\u08cf\u0001\u0000\u0000\u0000\u08d1\u08d2\u0001\u0000\u0000\u0000"+
		"\u08d2\u08d5\u0001\u0000\u0000\u0000\u08d3\u08d1\u0001\u0000\u0000\u0000"+
		"\u08d4\u08ca\u0001\u0000\u0000\u0000\u08d4\u08d5\u0001\u0000\u0000\u0000"+
		"\u08d5\u08d7\u0001\u0000\u0000\u0000\u08d6\u08b4\u0001\u0000\u0000\u0000"+
		"\u08d6\u08c8\u0001\u0000\u0000\u0000\u08d7\u08d9\u0001\u0000\u0000\u0000"+
		"\u08d8\u08da\u0003\u00b4Z\u0000\u08d9\u08d8\u0001\u0000\u0000\u0000\u08d9"+
		"\u08da\u0001\u0000\u0000\u0000\u08da\u08db\u0001\u0000\u0000\u0000\u08db"+
		"\u08dd\u0005\u0002\u0000\u0000\u08dc\u08b2\u0001\u0000\u0000\u0000\u08dc"+
		"\u08b3\u0001\u0000\u0000\u0000\u08dd\u00b3\u0001\u0000\u0000\u0000\u08de"+
		"\u08df\u0005@\u0000\u0000\u08df\u08ef\u0003\u00b6[\u0000\u08e0\u08e1\u0005"+
		"A\u0000\u0000\u08e1\u08ef\u0003\u00b6[\u0000\u08e2\u08e3\u0005@\u0000"+
		"\u0000\u08e3\u08e4\u0005!\u0000\u0000\u08e4\u08e5\u0003\u00b6[\u0000\u08e5"+
		"\u08e6\u0005\u001c\u0000\u0000\u08e6\u08e7\u0003\u00b6[\u0000\u08e7\u08ef"+
		"\u0001\u0000\u0000\u0000\u08e8\u08e9\u0005A\u0000\u0000\u08e9\u08ea\u0005"+
		"!\u0000\u0000\u08ea\u08eb\u0003\u00b6[\u0000\u08eb\u08ec\u0005\u001c\u0000"+
		"\u0000\u08ec\u08ed\u0003\u00b6[\u0000\u08ed\u08ef\u0001\u0000\u0000\u0000"+
		"\u08ee\u08de\u0001\u0000\u0000\u0000\u08ee\u08e0\u0001\u0000\u0000\u0000"+
		"\u08ee\u08e2\u0001\u0000\u0000\u0000\u08ee\u08e8\u0001\u0000\u0000\u0000"+
		"\u08ef\u00b5\u0001\u0000\u0000\u0000\u08f0\u08f1\u0005B\u0000\u0000\u08f1"+
		"\u08f8\u0007\u0019\u0000\u0000\u08f2\u08f3\u0005E\u0000\u0000\u08f3\u08f8"+
		"\u0005I\u0000\u0000\u08f4\u08f5\u0003\u0084B\u0000\u08f5\u08f6\u0007\u0019"+
		"\u0000\u0000\u08f6\u08f8\u0001\u0000\u0000\u0000\u08f7\u08f0\u0001\u0000"+
		"\u0000\u0000\u08f7\u08f2\u0001\u0000\u0000\u0000\u08f7\u08f4\u0001\u0000"+
		"\u0000\u0000\u08f8\u00b7\u0001\u0000\u0000\u0000\u08f9\u08fe\u0003\u00ba"+
		"]\u0000\u08fa\u08fb\u0005\u0004\u0000\u0000\u08fb\u08fd\u0003\u00ba]\u0000"+
		"\u08fc\u08fa\u0001\u0000\u0000\u0000\u08fd\u0900\u0001\u0000\u0000\u0000"+
		"\u08fe\u08fc\u0001\u0000\u0000\u0000\u08fe\u08ff\u0001\u0000\u0000\u0000"+
		"\u08ff\u00b9\u0001\u0000\u0000\u0000\u0900\u08fe\u0001\u0000\u0000\u0000"+
		"\u0901\u0911\u0003\u00bc^\u0000\u0902\u0911\u0005\u00e9\u0000\u0000\u0903"+
		"\u0911\u00059\u0000\u0000\u0904\u0911\u00055\u0000\u0000\u0905\u0911\u0005"+
		"6\u0000\u0000\u0906\u0911\u00057\u0000\u0000\u0907\u0911\u00058\u0000"+
		"\u0000\u0908\u0911\u0005:\u0000\u0000\u0909\u0911\u00052\u0000\u0000\u090a"+
		"\u0911\u00053\u0000\u0000\u090b\u0911\u0005;\u0000\u0000\u090c\u0911\u0005"+
		"c\u0000\u0000\u090d\u0911\u0005f\u0000\u0000\u090e\u0911\u0005d\u0000"+
		"\u0000\u090f\u0911\u0005e\u0000\u0000\u0910\u0901\u0001\u0000\u0000\u0000"+
		"\u0910\u0902\u0001\u0000\u0000\u0000\u0910\u0903\u0001\u0000\u0000\u0000"+
		"\u0910\u0904\u0001\u0000\u0000\u0000\u0910\u0905\u0001\u0000\u0000\u0000"+
		"\u0910\u0906\u0001\u0000\u0000\u0000\u0910\u0907\u0001\u0000\u0000\u0000"+
		"\u0910\u0908\u0001\u0000\u0000\u0000\u0910\u0909\u0001\u0000\u0000\u0000"+
		"\u0910\u090a\u0001\u0000\u0000\u0000\u0910\u090b\u0001\u0000\u0000\u0000"+
		"\u0910\u090c\u0001\u0000\u0000\u0000\u0910\u090d\u0001\u0000\u0000\u0000"+
		"\u0910\u090e\u0001\u0000\u0000\u0000\u0910\u090f\u0001\u0000\u0000\u0000"+
		"\u0911\u00bb\u0001\u0000\u0000\u0000\u0912\u0916\u0005\u00f7\u0000\u0000"+
		"\u0913\u0916\u0003\u00be_\u0000\u0914\u0916\u0003\u00c2a\u0000\u0915\u0912"+
		"\u0001\u0000\u0000\u0000\u0915\u0913\u0001\u0000\u0000\u0000\u0915\u0914"+
		"\u0001\u0000\u0000\u0000\u0916\u00bd\u0001\u0000\u0000\u0000\u0917\u0918"+
		"\u0005\u00f8\u0000\u0000\u0918\u00bf\u0001\u0000\u0000\u0000\u0919\u091b"+
		"\u0005\u0087\u0000\u0000\u091a\u0919\u0001\u0000\u0000\u0000\u091a\u091b"+
		"\u0001\u0000\u0000\u0000\u091b\u091c\u0001\u0000\u0000\u0000\u091c\u0936"+
		"\u0005\u00f4\u0000\u0000\u091d\u091f\u0005\u0087\u0000\u0000\u091e\u091d"+
		"\u0001\u0000\u0000\u0000\u091e\u091f\u0001\u0000\u0000\u0000\u091f\u0920"+
		"\u0001\u0000\u0000\u0000\u0920\u0936\u0005\u00f3\u0000\u0000\u0921\u0923"+
		"\u0005\u0087\u0000\u0000\u0922\u0921\u0001\u0000\u0000\u0000\u0922\u0923"+
		"\u0001\u0000\u0000\u0000\u0923\u0924\u0001\u0000\u0000\u0000\u0924\u0936"+
		"\u0005\u00ef\u0000\u0000\u0925\u0927\u0005\u0087\u0000\u0000\u0926\u0925"+
		"\u0001\u0000\u0000\u0000\u0926\u0927\u0001\u0000\u0000\u0000\u0927\u0928"+
		"\u0001\u0000\u0000\u0000\u0928\u0936\u0005\u00f0\u0000\u0000\u0929\u092b"+
		"\u0005\u0087\u0000\u0000\u092a\u0929\u0001\u0000\u0000\u0000\u092a\u092b"+
		"\u0001\u0000\u0000\u0000\u092b\u092c\u0001\u0000\u0000\u0000\u092c\u0936"+
		"\u0005\u00f1\u0000\u0000\u092d\u092f\u0005\u0087\u0000\u0000\u092e\u092d"+
		"\u0001\u0000\u0000\u0000\u092e\u092f\u0001\u0000\u0000\u0000\u092f\u0930"+
		"\u0001\u0000\u0000\u0000\u0930\u0936\u0005\u00f5\u0000\u0000\u0931\u0933"+
		"\u0005\u0087\u0000\u0000\u0932\u0931\u0001\u0000\u0000\u0000\u0932\u0933"+
		"\u0001\u0000\u0000\u0000\u0933\u0934\u0001\u0000";
	private static final String _serializedATNSegment1 =
		"\u0000\u0000\u0934\u0936\u0005\u00f6\u0000\u0000\u0935\u091a\u0001\u0000"+
		"\u0000\u0000\u0935\u091e\u0001\u0000\u0000\u0000\u0935\u0922\u0001\u0000"+
		"\u0000\u0000\u0935\u0926\u0001\u0000\u0000\u0000\u0935\u092a\u0001\u0000"+
		"\u0000\u0000\u0935\u092e\u0001\u0000\u0000\u0000\u0935\u0932\u0001\u0000"+
		"\u0000\u0000\u0936\u00c1\u0001\u0000\u0000\u0000\u0937\u0938\u0007\u001a"+
		"\u0000\u0000\u0938\u00c3\u0001\u0000\u0000\u0000\u0142\u00de\u00e3\u00e6"+
		"\u00eb\u00f8\u00fc\u0103\u0108\u010d\u0110\u0113\u0117\u011b\u011e\u0121"+
		"\u0128\u012c\u0134\u0137\u013a\u013d\u0140\u0143\u0147\u014a\u014d\u0154"+
		"\u015a\u0160\u0168\u0188\u0190\u0194\u0199\u019f\u01a7\u01ad\u01ba\u01bf"+
		"\u01c8\u01cd\u01dd\u01e4\u01e8\u01f0\u01f7\u01fe\u020d\u0211\u0217\u021d"+
		"\u0220\u0223\u0229\u022d\u0231\u0236\u023a\u0242\u0245\u024e\u0253\u0259"+
		"\u0260\u0263\u0269\u0274\u0277\u027b\u0280\u0285\u028c\u028f\u0292\u0299"+
		"\u029e\u02a4\u02ad\u02b5\u02bb\u02bf\u02c3\u02c7\u02c9\u02d2\u02d8\u02dd"+
		"\u02e0\u02e4\u02e7\u02f1\u02f4\u02f8\u02fd\u0300\u0306\u030e\u0313\u0319"+
		"\u031f\u032a\u0332\u0339\u0341\u0344\u034c\u0350\u0357\u03cb\u03d3\u03db"+
		"\u03e4\u03f0\u03f4\u03f7\u03fd\u0407\u0413\u0418\u041e\u042a\u042c\u0431"+
		"\u0435\u043a\u043f\u0442\u0447\u044b\u0450\u0452\u0456\u045f\u0467\u046e"+
		"\u0475\u047e\u0483\u0492\u0499\u049c\u04a3\u04a7\u04ad\u04b5\u04c0\u04cb"+
		"\u04d2\u04d8\u04de\u04e7\u04e9\u04f2\u04f5\u04fe\u0501\u050a\u050d\u0516"+
		"\u0519\u051c\u0521\u0523\u0526\u0531\u0536\u0541\u0545\u0549\u0555\u0558"+
		"\u055c\u0566\u056a\u056c\u056f\u0573\u0576\u057a\u0580\u0584\u0588\u058d"+
		"\u0590\u0592\u0597\u059c\u059f\u05a3\u05a6\u05a8\u05ad\u05b2\u05bf\u05c4"+
		"\u05cc\u05d2\u05dc\u05eb\u05f0\u05f8\u05fb\u05ff\u0604\u060d\u0610\u0615"+
		"\u061c\u061f\u0627\u062e\u0635\u0638\u063d\u0643\u0647\u064a\u064d\u0658"+
		"\u065d\u0662\u0675\u0677\u0679\u0686\u068f\u0696\u069e\u06a6\u06aa\u06b2"+
		"\u06ba\u06c0\u06c8\u06d4\u06d7\u06dd\u06e1\u06e3\u06ec\u06f8\u06fa\u0701"+
		"\u0708\u070e\u0714\u0716\u071b\u0722\u0728\u072c\u072e\u0735\u0743\u074b"+
		"\u074d\u0752\u0755\u075d\u0766\u076c\u0774\u077a\u077f\u0784\u078a\u079f"+
		"\u07a1\u07aa\u07ae\u07b7\u07bb\u07cd\u07d0\u07d8\u07e1\u07f8\u0803\u080a"+
		"\u080d\u0812\u0821\u082b\u082d\u083a\u083c\u084a\u0851\u0854\u0858\u085d"+
		"\u086e\u0872\u087b\u087f\u0881\u0888\u088f\u0896\u089e\u08ab\u08bb\u08c5"+
		"\u08c8\u08d1\u08d4\u08d6\u08d9\u08dc\u08ee\u08f7\u08fe\u0910\u0915\u091a"+
		"\u091e\u0922\u0926\u092a\u092e\u0932\u0935";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}