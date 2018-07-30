
package com.collection.languageidentifier;


public class LanguageRules {
	
	// 1. English Language
	public static String englishCommonWords[] = {"a","an","and","in","of","on","the","that","to","is","I","be","have","it","for","not","with","as","do","this"};
	public static String englishSuffixes[] = {"ing","tion","ed","age","'s","'ve","n't","'d","al","acy","dom","ist","ity","ate","en","ify","ize","ful","ic","ive"};
	public static char[] englishSpecialCharacters = {};
	
	// 2. Italian Language
	public static String italianCommonWords[] = {"è","perché","come","io","che","lui","era","per","su","sono","con","essi","uno","avere","questo","da","caldo","ma","cosa","alcuni"};
	public static String italianSuffixes[] = {"aia","ento","tà","ggio","aio","ista","tore","ccio","stro","ano","ese","ata","ento","tura","ei","etto","ino","one","eria","ere"};
	public static char[] italianSpecialCharacters = {'ò','à','ù','ì','é','è','ó','ô','Ò','À','Ù','Ì','É','È','Ó','Ô'};
	
	// 3. French Language
	public static String frenchCommonWords[] = {"de","la","le","du","des","il","et","un","à","être","en","que","pour","ce","qui","se","pas","plus","par","je"};
	public static String frenchSuffixes[] = {"ux","acé","ain","ât","âtre","é","ème","erai","fère","gène","ière","is","ît","man","mont","oche","oir","ot","quin","ïsme"};
	public static char[] frenchSpecialCharacters = {'é','à','è','ê','ç','ô','ù','â','û','î','œ','ï','ë','ü','æ','ñ','É','À','È','Ê','Ç','Ô','Ù','Â','Û','Î','Œ','Ï','Ë','Ü','Æ','Ñ'};
	
	// 4. Spanish Language
	public static String spanishCommonWords[] = {"de","el","que","del","los","la","uno","una","y","los","por","con","sobre","también","había","así","él","después","sí","país"};
	public static String spanishSuffixes[] = {"ción","ento","dad","aba","áis","anza","aré","ceta","ción","lasa","ear","eda","eña","eré","ez","fila","geno","ías","illa","lito"};
	public static char[] spanishSpecialCharacters = {'í','ó','é','á','ñ','ú','ü','Í','Ó','É','Á','Ñ','Ú','Ü'};
	
	// 5. Dutch Language
	public static String dutchCommonWords[] = {"het","op","en","een","voor","ik","je","dat","niet","wat","van","ze","te","zijn","maar","ben","mijn","dit","aan","om"};
	public static String dutchSuffixes[] = {"tje","sje","ing","en","lijk","aar","aat","ares","ator","baar","der","dom","eur","ief","iek","ist","jes","kje","loog","meer"};
	public static char[] dutchSpecialCharacters = {'á','é','í','ó','ú','à','è','ë','ï','ö','ü','Á','É','Í','Ó','Ú','À','È','Ë','Ï','Ö','Ü'};
	
	// 6. German Language
	public static String germanCommonWords[] = {"der","die","das","den","dem","des","er","sie","es","ist","ich","du","aber","und","wir","zu","ein","mir","daß","haben"};
	public static String germanSuffixes[] = {"en","er","ern","st","ung","chen","tät","sch","eln","erei","graf","iert","ös","phil","sel","thum","trop","ung","voll","witz"};
	public static char[] germanSpecialCharacters = {'Ä','ä','Ö','ö','Ü','ü','ß'};
	
	// 7. Romanian Language
	public static String romanianCommonWords[] = {"și","de","la","ai","ale","alor","cu","eu","lui","că","pentru","pe","sunt","una","au","acest","fierbinte","cuvânt","dar","unele"};
	public static String romanianSuffixes[] = {"ă","ului","ţie","ment","tate","abil","ată","ăreț","ean","ești","ești","ime","lor","lui","mânt","oaie","șor","tate","ului","va"};
	public static char[] romanianSpecialCharacters = {'Ă','ă','Â','â','Î','î','Ș','ș','Ț','ț'};
	
	// 8. Portuguese Language
	public static String portugueseCommonWords[] = {"ao","às","da","de","do","em","os","ou","um","aos","das","dos","ele","ela","mas","não","por","que","são","uma"};
	public static String portugueseSuffixes[] = {"ção","dade","ismo","ente","agem","ança","ão","ario","cida","ejar","emia","eyra","íaco","idão","indo","logo","ões","oma","pata","teca"};
	public static char[] portugueseSpecialCharacters = {'ã','ç','á','é','ó','õ','ê','ô','à','í','è','ú','Ã','Ç','Á','É','Ó','Õ','Ê','Ô','À','Í','È','Ú'};
	
	// 9. Walloon Language
	public static String walloonCommonWords[] = {"al","ås","li","el","vs","ki","si","pô","pa","po","ni","èn","dj'", "dji", "nén", "rén", "bén","pol","mel","Bondjoû"};
	public static String walloonSuffixes[] = {"edje","mint","ès","ou","owe","yî","cion"};
	public static char[] walloonSpecialCharacters = {'â','å','ç','é','è','ê','ë','î','ô','ö','û','Â','Å','Ç','É','È','Ê','Ë','Î','Ô','Ö','Û'};
	
	// 10. Swedish Language
	public static String swedishCommonWords[] = {"och","i","att","det","en","som","är","av","den","på","jag","inte","har","för","han","vad","med","mig","som","dig"};
	public static String swedishSuffixes[] = {"ande","ast","atör","bar","bo","dom","ell","eri","erna","gnos","graf","het","itet","inna","lös","nomi","ning","orna","skap","ör"};
	public static char[] swedishSpecialCharacters = {'ä','å','ö','Ä','Å','Ö'};
	
	// 11. Norwegian Language
	public static String norwegianCommonWords[] = {"av","ble","er","og","en","et","å","for","eller","det","på","som","til","han","med","var","de","ikke","har","om"};
	public static String norwegianSuffixes[] = {"sjon","ing","else","het","sen","verk","iss","ende","abel","boer","fon","graf","håra","itt","logi","ning","pati","sjon","tekt","øs"};
	public static char[] norwegianSpecialCharacters = {'ø','æ','Æ','Ø','Å','å'};
	
	// 12. Azeri Language
	public static String azeriCommonWords[] = {"və","ki","ilə","bu","o","isə","görə","da","də","bəli","xeyr","bəlkə","oldu","Bilmirəm","Mənim","var","yoxdur","olmaq","kimi","bir"};
	public static String azeriSuffixes[] = {"lar","lər","ın","in","da","də","dan","dən"};
	public static char[] azeriSpecialCharacters = {'Ç','ç','Ə','ǝ','Ğ','ğ','Ö','ö','Ş','ş','Ü','ü'};
	
	// 13. Icelandic Language
	public static String icelandicCommonWords[] = {"ég","að","er","það","ekki","í","þú","við","þetta","hvað","mér","með","fyrir","þig","mig","því","hún","nei","allt","eru"};
	public static String icelandicSuffixes[] = {"ar","andi","ari","ir","ur","nn","há","ismi","isti","ið","laus","semi","sla","um","tola","un","tur","ína","st","æður"};
	public static char[] icelandicSpecialCharacters = {'á','í','ó','æ','ú','ö','é','ý','Á','Í','Ó','Æ','Ú','Ö','É','Ý'};
	
	// 14. Polish Language
	public static String polishCommonWords[] = {"nie","na","jest","tak","jak","mnie","ale","mi","ty","czy","tym","tego","tylko","jestem","po","cię","już","może","jesteś","coś"};
	public static String polishSuffixes[] = {"adać","arka","ący","ch","cki","dło","ica","isko","jad","kroć","ń","ość","ota","ować","ów","ska","stwo","ście","utki","wód"};
	public static char[] polishSpecialCharacters = {'ł','ę','ą','ż','ś','ó','ć','ń','ź','Ł','Ę','Ą','Ż','Ś','Ó','Ć','Ń','Ź'};
}