class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();

        List<int[]> l = new ArrayList<>();
        int sr = 0 , sc = 0;
        for(int i=0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                char  ch = classroom[i].charAt(j);

                if(ch == 'S'){
                    sr = i ; 
                    sc = j ; 
                }else if(ch == 'L'){
                    l.add(new int[]{i,j});
                }
            }
        }
        int k = l.size();
        if(k==0) return 0;
        int[][] id = new int[m][n];
        
        for(int [] row : id){
            Arrays.fill(row,-1);
        }
        for(int i=0 ; i<k ; i++){
            int[] p = l.get(i);
            id[p[0]][p[1]] = i;
        }
      int total = 1 << k;
      int cell = m*n;
      int [] best = new int [total*cell];
      Arrays.fill(best,-1);

      Queue<int[]> q = new ArrayDeque<>();
      best[sr*n + sc] = energy;
      q.offer(new int[]{sr ,sc , 0 , energy});
      
      int[] dr = {-1,1,0,0};
      int[] dc = {0,0,-1,1};
      int move = 0;

      while(!q.isEmpty()){
        int size = q.size();
        while(size-- > 0){
            int [] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            int mask = cur[2];
            int e = cur[3];
            if(mask == total-1){
                return move;
            }
            if(e==0) continue;

            for(int d=0 ; d<4 ; d++){
                int nr = r+dr[d];
                int nc = c+dc[d];

                if(nr < 0 || nr >= m || nc < 0 || nc >= n)
                 continue;

                 if(classroom[nr].charAt(nc) == 'X')
                 continue;

                 int ne = e-1;
                 int nmask = mask;

                 char ch = classroom[nr].charAt(nc);
                 if(ch == 'R')
                   ne  = energy;

                   if(id[nr][nc] != -1)
                    nmask |= 1 << id[nr][nc];
                    
                    int pos = nr * n + nc;
                    int idx = nmask * cell + pos;

                    if(best[idx] >= ne) continue;

                    best[idx] = ne;
                    q.offer(new int[]{nr,nc,nmask,ne});
            }
        }
        move++;
      }
      return -1;

    }
}