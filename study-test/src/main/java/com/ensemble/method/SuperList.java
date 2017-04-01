package com.ensemble.method;

public class SuperList implements List {

	@Override
	public void creatList(String s, String splitSymbl) {
		s=s.replace(" ", "");
		String sn[] = s.split(splitSymbl);
		
		String jsonTitle = "s jsonTitle=\"";
		String tmphead = "s tmp=";
		String tmp = "";

		System.out.println("");
		for (int i = 0; i < sn.length; i++) {

			if (sn[i].indexOf("->") != -1) {

				String linkword[] = sn[i].split("->");
				int length = linkword.length;
				String temp = linkword[length - 1];
				if (temp.indexOf("_") != -1) {
					String linkwordinner[] = temp.split("_");
					String tempinner = linkwordinner[1];
					System.out.println("s " + tempinner + "= result.Data(\""
							+ temp + "\")");
				} else {
					System.out.println("s " + temp + "= result.Data(\"" + temp
							+ "\")");

				}

			} else if (sn[i].indexOf(".") != -1) {

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
		System.out.println("this is No.2");
		for (int i = 0; i < sn.length; i++) {
			if (i == 0) {
				jsonTitle = jsonTitle + "rowid";
			} else {
				if (sn[i].indexOf("->") != -1) {
					String linkword[] = sn[i].split("->");
					int length = linkword.length;

					String temp = linkword[length - 1];
					if (temp.indexOf("_") != -1) {
						String linkwordinner[] = temp.split("_");
						String tempinner = linkwordinner[1];
						jsonTitle = jsonTitle + "^" + tempinner;
					} else {
						jsonTitle = jsonTitle + "^" + temp;

					}

				} else if (sn[i].indexOf("_") != -1) {
					String linkword[] = sn[i].split("_");
					String temp = linkword[1];
					jsonTitle = jsonTitle + "^" + temp;

				} else {

					jsonTitle = jsonTitle + "^" + sn[i];
				}

			}
		}

		System.out.println(jsonTitle + "\"");

		// no.3
		System.out.println("this is No.3");
		for (int i = 0; i < sn.length; i++) {

			if (sn[i].indexOf("->") != -1) {
				String linkword[] = sn[i].split("->");
				int length = linkword.length;

				String temp = linkword[length - 1];
				if (temp.indexOf("_") != -1) {
					String linkwordinner[] = temp.split("_");
					String tempinner = linkwordinner[1];
					tmp = tmp + "_\"^\"_" + tempinner;
				} else {
					tmp = tmp + "_\"^\"_" + temp;

				}

			} else if (sn[i].indexOf("_") != -1) {
				String linkword[] = sn[i].split("_");
				String temp = linkword[1];
				tmp = tmp + "_\"^\"_" + temp;

			} else {

				tmp = tmp + "_\"^\"_" + sn[i];
			}

		}
		tmp = tmp.substring(5);
		tmp = tmphead + tmp;
		System.out.println(tmp);

	}

}
