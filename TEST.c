# include <stdio.h>
# include <stdlib.h>
# include <time.h>

void shuffle(short [][2]);/*TODO 2*/
void printCardAndPoint(short [][2],short n_card);/*TODO 6*/
int calculatePoint(short [][2],short n_card);/*TODO 7*/

int main (void){
	srand(time(NULL)); /*set random seed*/
	char user[10];
	int money=1000; /*the initial money user has*/
	short cards[52][2];
	/*TODO 1: Edit next line, generate cards array
	* Rows: each cards, Columns: Suit, Rank
	 * set club as 1, diamond as 2, heart as 3, spade as 4
	 * set rank as 1~13, stand for A, 2, 3, ...., 10, J, Q, K
	 * Hint: for 10pt*/

	for (int i=0;i<52;i++){
			cards[i][0]=(i/13)+1; /*club*/
			cards[i][1]=(i%13)+1; /*rank*/
		}

	/*TODO 1 end*/

  /*TODO 2: implement shuffle function that can shuffle cards
	* Rows: each cards, Columns: Suit, Rank
	 * Hint: for 10pt*/
	 shuffle(cards); /*Don't edit this line, please complete the shuffle function (at the bottom of the code)*/
	/*TODO 2 end*/

	printf("Please enter your identification (string):");
	fflush(stdout);
	/*TODO 3: Edit next line, let user input her/his name, save the input to char array (string) user
	 * Hint: gets 10pt*/
	gets(user);


	/*TODO 3 end*/

	printf("How many money you want to bet:");
	fflush(stdout);
	int bet;
	scanf("%d",&bet);
	printf("User's name:%s, total money %d, bet %d dollars\n",user,money,bet);
	fflush(stdout);

	/*TODO 4: Edit next line, print user's name and the user's total money, and the money user bet
	 * Hint: printf 10pt*/



	/*TODO 4 end*/

	int card_sequence=0;
	short banker_card_close[1][2], banker_cards_open[10][2];
	short user_cards[10][2];



	/*TODO 5: Edit next part, distribute card (in sequence) to banker and user
	 * In this stage, Banker has two cards,
	 * one open card (in banker_card_open[10][2], already distributed below),
	 * one close card (in banker_card_close[2], please finish below)
	 * User has two cards (in user_cards[10][2], please finish below)
	 * Rows: each cards, Columns: Suit, Rank
     * 10pt
	 */

	banker_cards_open[0][0]=cards[card_sequence][0];
	banker_cards_open[0][1]=cards[card_sequence][1];
	card_sequence++;
	banker_card_close[0][0]=cards[card_sequence][0];
	banker_card_close[0][1]=cards[card_sequence][1];
	card_sequence++;
	user_cards[0][0]=cards[card_sequence][0];
	user_cards[0][1]=cards[card_sequence][1];
	card_sequence++;
	user_cards[1][0]=cards[card_sequence][0];
	user_cards[1][1]=cards[card_sequence][1];
	card_sequence++;

	/*TODO 5 end*/

	/*TODO 6 and 7: finish printCardAndPoint (at the bottom of the code),
	 * the function can calculate the total point (TODO 7), and print all the cards and their total points (using BlackJack rules, TODO 6)
	 * 10pt
	 */
	printf("Banker's open card:\n");
	fflush(stdout);
	printCardAndPoint(banker_cards_open,1);/*Don't edit this line, please complete the printCardAndPoint function (at the bottom of the code)*/
	printf("User's cards:\n");
	fflush(stdout);
	printCardAndPoint(user_cards,2);/*Don't edit this line, please complete the printCardAndPoint function (at the bottom of the code)*/
	/*TODO 6 end*/

	char isDraw;
	int user_cards_seq=2;
	/*TODO 8: Edit next part, ask user if he/she wants more cards?
	 * when user say Y, add one card to user_cards[10][2], and print all user's cards and points (call printCardAndPoint)
	 * then calculate the total point, if total point >=21, stop asking, and go to the next step
	 * If user say N, stop asking, and go to the next step
     * Hint: do-while 10pt if-else 10pt
	 * 10pt
	 */

	do
	{
		printf("one more card?");
		fflush(stdout);
		scanf(" %c",&isDraw);
		if(isDraw=='Y')
		{
			user_cards[user_cards_seq][0]=cards[card_sequence][0];
			user_cards[user_cards_seq][1]=cards[card_sequence][1];
			card_sequence++;
			user_cards_seq++;
			printf("User's cards now:");
			fflush(stdout);
		}
		else
		break;

		if(calculatePoint(user_cards,2)>=21)
		break;

	}
	while(isDraw=='Y');


	/*TODO 8 end*/

	short banker_all_card[2][2]={{banker_card_close[0][0],banker_card_close[0][1]},{banker_cards_open[0][0],banker_cards_open[0][1]}};
	printf("Banker's all card:\n");
	printCardAndPoint(banker_all_card,2);

	int banker_final_sum=calculatePoint(banker_all_card,2); /*Banker's total points*/
	int user_final_sum=calculatePoint(user_cards,user_cards_seq); /*User's total points*/

	printf("Your total points: %d\n",user_final_sum);
	printf("Banker's total points: %d\n",banker_final_sum);

	if(banker_final_sum==user_final_sum){
		printf("Tie! ");
	}else if(banker_final_sum>user_final_sum|user_final_sum>21){
		money-=bet;
		printf("You Lose! ");
	}else{
		money+=bet;
		printf("You Win! ");
	}

	printf("Your money now is: %d\n",money);
	return 0;
}
void shuffle(short cards[][2]){
	/*TODO 2: implement shuffle function that can shuffle cards
	* Rows: each cards, Columns: Suit, Rank
	 * Hint: for 10pt*/
	for(int i=0;i<52;i++){
			int temp_club, temp_rank,rand_place;
			temp_club=cards[i][0];
			temp_rank=cards[i][1];
			rand_place=rand()%52;
			cards[i][0]=cards[rand_place][0];
			cards[i][1]=cards[rand_place][1];
			cards[rand_place][0]=temp_club;
			cards[rand_place][1]=temp_rank;
	}

	/*TODO 2 end*/
}
void printCardAndPoint(short cards[][2],short n_card){
	/*TODO 6: finish printCardAndPoint, the function can calculate the total point (call calculatePoint *TODO 7)
	 * print all the cards and their total points (using BlackJack rules)
     * Hint: for
	 * 10pt
	 */

	for(int i=0;i<n_card;i++)
	{
		printf("Suit=%d, Rank=%d; ",cards[i][0],cards[i][1]);
		fflush(stdout);
	}
	printf("\nTotal points=%d",calculatePoint(cards,n_card));
	fflush(stdout);

	/*TODO 6 end*/
}

int calculatePoint(short cards[][2],short n_card){
	int totalPoint=0;
	/*TODO 7: calculate the total point (call calculatePoint) and return
	* be careful of A, can be 11 or 1
     * Hint: if-else
	 * for and if-else 10pt
	 */


	int have_1=0;
		for(int j=0;j<n_card;j++)
		{
			if(cards[j][1]==1)
			{
			have_1=1;
			break;
			}
		}
		for(int i=0;i<n_card;i++)
		{
			totalPoint=totalPoint+cards[i][1];
			if(have_1==1&&totalPoint<=11)
			{
				totalPoint=totalPoint+10;
			}
		}



	/*TODO 7 end*/
	return totalPoint;
}