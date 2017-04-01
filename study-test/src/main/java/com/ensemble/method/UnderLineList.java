package com.ensemble.method;

public class UnderLineList implements List {

	@Override
	public void creatList(String s, String splitSymbl) {
		// TODO Auto-generated method stub
		String ss = s.toLowerCase();
		s = s.toLowerCase().substring(s.toLowerCase().indexOf("select") + 6,
				s.toLowerCase().indexOf("from"));
		s = s.replace(" ", "");
		splitSymbl = splitSymbl.trim();
		String sn[] = s.toLowerCase().split(splitSymbl);

		String jsonTitle = "\ts jsonTitle=\"";
		String tmphead = "\ts temp=";
		String tmp = "";

		System.out.println("ClassMethod List(sortField, sortDir, start, limit) As %String");
		System.out.println("{");
		System.out.println("\tn (sortField,sortDir,start,limit)");
		System.out.println("\ts sqlStr=\"" + ss + "\"");
		System.out.println("\ts result=##class(%Library.ResultSet).%New()");
		System.out.println("\td result.Prepare(sqlStr)");
		System.out.println("\td result.Execute()");
		System.out.println("");
		System.out.println("\ts resultString=\"\"");
		System.out.println("\ts end=start+limit-1");
		System.out.println("");
		System.out.println("\ts json=##class(herp.comm.JsonObj).%New()");

		// 此处代码用于生成jsontitle
		for (int i = 0; i < sn.length; i++) {
			if (i == 0) {
				jsonTitle = jsonTitle + "rowid";
			} else {

				sn[i]=sn[i].substring(sn[i].lastIndexOf("_")+1).substring(sn[i].substring(sn[i].lastIndexOf(".")+1).lastIndexOf("_")+1);
				jsonTitle = jsonTitle + "^" + sn[i];
			}
		}
		System.out.println("\tWhile(result.Next())");
		System.out.println("\t{");
		// 此处用于获取原始列值
		for (int i = 0; i < sn.length; i++) {
			if (sn[i].indexOf(".") != -1) {

			// System.out.println("________"+sn[i]);
			String tail = sn[i].substring(sn[i].indexOf(".") + 1);

			if (sn[i].indexOf("_") != -1) {

				String linkwordinner[] = sn[i].split("_");
				String tempinner = linkwordinner[1];
				System.out.println("s " + tempinner + "= result.Data(\""
						+ tail + "\")");
			} else {
				System.out.println("s " + tail + "= result.Data(\"" + tail
						+ "\")");
			}

		} else {

			System.out.println("s " + sn[i] + "= result.Data(\"" + sn[i]
					+ "\")");
		}
			}
		System.out.println();
		System.out.println();
		for (int i = 0; i < sn.length; i++) {
			if (sn[i].indexOf(".") != -1) {
				sn[i] = sn[i].substring(sn[i].indexOf(".") + 1);
			}
			tmp = tmp + "_\"^\"_" + sn[i];
		}
		tmp = tmp.substring(5);
		tmp = tmphead + tmp;
		System.out.println(tmp);
		System.out.println("\ti (count>=start)&(count<=end) d");
		System.out.println("\t.d json.InsertRowData(temp)");
		System.out.println("\ts count=count+1");
		System.out.println("\t}");
		System.out.println("");
		System.out.println("\td result.Close()");
		System.out.println("\ts resultString = json.getJsonData(jsonTitle,count)");
		System.out.println("\tk json");
		System.out.println("\tq resultString");
		System.out.println("}");
	}

}
